//linked list insertion at specified position
class LinkedList5{
Node head;
int size;
class Node{
int data;
Node next;
Node(int data){
this.data = data;
this.next = null;
size++;
}
}
int getsize(){
return this.size;
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
Node currNode= head;
while(currNode.next != null){
currNode = currNode.next;
}
currNode.next = newNode;
}
void addPos(int data , int pos){
int i =0;
Node newNode = new Node(data);
if(head == null){
head = newNode;
return;
}
if(pos !=0){
Node currNode = head;
Node prevNode = null;
while(currNode.next != null && i<pos){
prevNode = currNode;
currNode = currNode.next;
i++;
}
prevNode.next = newNode;
newNode.next = currNode;
}
else{
newNode.next = head;
head = newNode;
}
}
void printList(){
if(head == null){
System.out.println("list is empty");
return;
}
Node currNode = head;
while(currNode != null){
System.out.print(currNode.data + "=>");
currNode = currNode.next;
}
System.out.println("Null");
}
Boolean search(int data){
Node currNode = head;
while(currNode != null){
if(currNode.data == data){
return true;
}
currNode = currNode.next;
}
return false;
}
}

class ll5{
public static void main(String [] args){
LinkedList5 list = new LinkedList5();
list.addFirst(222);
list.addFirst(333);
list.addFirst(555);
list.addLast(777);
list.addLast(666);
list.printList();
System.out.println(list.getsize());
System.out.println(list.search(555));
list.addPos(888,2);
list.printList();
}
}

/*

C:\Users\ankur\Desktop\Utkarsh\Javanote>javac ll5.java

C:\Users\ankur\Desktop\Utkarsh\Javanote>java ll5
555=>333=>222=>777=>666=>Null
5
true
555=>333=>888=>222=>777=>666=>Null
*/