//linked delete the elements
class LinkedList9{
Node head;
int size;
class Node{
int data;
Node next;
Node(int data){
this.data=data;
this.next=null;
size++;
}
}
void addFirst(int data){
Node newNode = new Node(data);
if(head == null){
head = newNode;
return;
}
newNode.next = head ;
head = newNode;
}
void addLast(int data){
Node newNode = new Node(data);
if(head== null){
head = newNode;
return;
}
Node currNode = head;
while(currNode.next != null){
currNode = currNode.next;
}
currNode.next = newNode;
}
void deleteElements(int data){
Node temp = head;
if(temp == null){
System.out.println("List is empty");
return;
}
if(temp.data == data){
head = head.next;
size--;
}
while (temp.next != null){
if(temp.next.data == data){
temp.next = temp.next.next;
size--;
}
if(temp.next != null){
temp= temp.next;
}
}
}
void printList(){
if(head == null){
System.out.println("list is empty");
return;
}
Node currNode = head;
while( currNode != null){
System.out.print(currNode.data + " =>");
currNode = currNode.next;
}
System.out.println("Null");
}
}
class ll9{
public static void main(String [] args){
LinkedList9 li = new LinkedList9();
li.addFirst(111);
li.addFirst(222);
li.addFirst(111);
li.addLast(333);
li.addLast(222);
li.addLast(222);
li.printList();
li.deleteElements(111);
li.printList();
}
}
/*
C:\Users\ankur\Desktop\Utkarsh\Javanote>javac ll9.java

C:\Users\ankur\Desktop\Utkarsh\Javanote>java ll9
111 =>222 =>111 =>333 =>222 =>222 =>Null
222 =>333 =>222 =>222 =>Null
*/