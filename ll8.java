//linked list for delete element
class LinkedList8{
Node head;
int size;
class Node{
Node next;
int data;
Node (int data){
this.data = data;
this.next = null;
size++;
}
}
void addFirst(int data){
Node newNode = new Node(data);
if(head == null){
head = newNode;
return;
}
newNode.next = head;
head = newNode;
}
void addLast(int data){
Node newNode = new Node(data);
if(head == null){
head = newNode;
return;
}
Node temp = head;
while(temp.next != null){
temp = temp.next;
}
temp.next = newNode;
}
void deleteElement(int data){
Node temp = head;
if(temp == null){
System.out.println("empty");
return;
}
if(temp.data == data){
head = head.next;
size++;
return;
}
while(temp.next != null){
if(temp.next.data == data){
temp.next = temp.next.next;
size--;
return;
}
temp = temp.next;
}
}
void printList(){
if(head == null){
System.out.println("List is Empty");
return;
}
Node temp = head;
while(temp != null){
System.out.print(temp.data + "=>");
temp= temp.next;
}
System.out.println("Null");
}
}

class ll8{
public static void main(String [] args){
LinkedList8 list = new LinkedList8();
list.addFirst(333);
list.addFirst(222);
list.addFirst(444);
list.addLast(777);
list.addLast(111);
list.addLast(999);
list.printList();
list.deleteElement(444);
list.printList();
}
}

/*

C:\Users\ankur\Desktop\Utkarsh\Javanote>javac ll8.java

C:\Users\ankur\Desktop\Utkarsh\Javanote>java ll8
444=>222=>333=>777=>111=>999=>Null
222=>333=>777=>111=>999=>Null

*/
