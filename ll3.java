//linked list delete first first and last element
//creation of node
class LinkedList3{
Node head;
class Node{
int data;
Node next;
Node(int data){
this.data = data;
this.next = null;
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
void printList(){
if(head == null){
System.out.println("List is Empty");
return;
}
Node temp = head;
while(temp != null){
System.out.print(temp.data + "=>");
temp = temp.next;
}
System.out.println("Null");
}

void deleteFirst(){
if(head == null){
System.out.println("list is empty");
return;
}
head = head.next;
}

void deleteLast(){
if(head == null){
System.out.println("list is empty");
return;
}
if(head.next == null){
head = null;
return;
}
Node temp1, temp2;
temp1 = head;
temp2 = head.next;
while(temp2.next != null){
temp2 = temp2.next;
temp1 = temp1.next;
}
temp1.next = null;
}
}

class ll3{
public static void main(String [] args){
LinkedList3 List = new LinkedList3();
List.addFirst(111);
List.addFirst(333);
List.printList();
List.addLast(222);
List.addLast(444);
List.printList();
List.deleteFirst();
List.printList();
List.deleteLast();
List.printList();
}
}

/*
C:\Users\ankur\Desktop\Utkarsh\Javanote>javac ll3.java

C:\Users\ankur\Desktop\Utkarsh\Javanote>java ll3
333=>111=>Null
333=>111=>222=>444=>Null
111=>222=>444=>Null
111=>222=>Null
*/