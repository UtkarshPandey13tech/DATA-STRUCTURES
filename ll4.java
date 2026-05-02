//linked list  insertion at first , insertion at last , treversing linked list , getting size of ll , searching element in ll
import java.util.*;
class SinglyLinkedList4{
Node head;
int size;
class Node{
int data;
Node next;
Node(int data){
this.data= data;
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
Node currNode = head;
while(currNode.next != null){
currNode = currNode.next;
}
currNode.next = newNode;
}
void printList(){
if(head == null){
System.out.println("List is Empty");
return;
}
Node currNode = head;
while(currNode != null){
System.out.print(currNode.data +" =>");
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

class ll4{
public static void main(String [] args){
SinglyLinkedList4 list = new SinglyLinkedList4();
list.addFirst(333);
list.addFirst(222);
list.addFirst(111);
list.addLast(444);
list.addLast(555);
list.addLast(666);
list.printList();
System.out.println(list.getsize());
System.out.println(list.search(222));
System.out.println(list.search(888));
}
}

/*

C:\Users\ankur\Desktop\Utkarsh\Javanote>javac ll4.java

C:\Users\ankur\Desktop\Utkarsh\Javanote>java ll4
111 =>222 =>333 =>444 =>555 =>666 =>Null
6
true
false
*/


