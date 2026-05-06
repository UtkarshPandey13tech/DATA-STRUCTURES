//linked list to delete any element at any position
class LinkedList10{
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
newNode.next = head;
head = newNode;
}
void addLast(int data){
Node newNode= new Node(data);
if(head == null){
head = newNode;
return;
}
Node currNode = head;
while(currNode.next != null){
currNode = currNode.next;
}
currNode.next = newNode;
}
void deleteElementatpos(int pos){
Node temp = head;
int i=0;
if(temp == null){
System.out.println("empty");
return;
}
if(pos ==0){
head = head.next;
size--;
return;
}
while(temp.next != null && i<pos){
if(i==pos-1){
temp.next = temp.next.next;
size--;
return;
}
i++;
temp = temp.next;
}
}


void printList(){
if(head == null){
System.out.println("list is empty");
return;
}
Node currNode = head;
while(currNode != null){
System.out.print(currNode.data + " =>");
currNode = currNode.next;
}
System.out.println("Null");
}
}
class ll10{
public static void main (String [] args){
LinkedList10 li = new LinkedList10();
li.addFirst(111);
li.addFirst(222);
li.addFirst(333);
li.addLast(444);
li.addLast(555);
li.printList();
li.deleteElementatpos(3);
li.printList();
}
}

/*
C:\Users\ankur\Desktop\Utkarsh\Javanote>javac ll10.java
C:\Users\ankur\Desktop\Utkarsh\Javanote>java ll10
333 =>222 =>111 =>444 =>555 =>Null
333 =>222 =>111 =>555 =>Null
*/


