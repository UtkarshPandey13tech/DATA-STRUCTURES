//linked insertion in ascending and descending order
import java.util.*;
class LinkedList6{
Node head;
int size;
class Node{
int data;
Node next;
Node(int data){
this.data = data;
this.next =null;
size++;
}
}
int getsize(){
return this.size;
}
void sortedasc(int data){
Node newNode = new Node(data);
Node currNode = head;
if(currNode == null || currNode.data>data){
newNode.next = head;
head = newNode;
return;
}
while(currNode.next != null && currNode.next.data<data){
currNode=currNode.next;
}
newNode.next = currNode.next;
currNode.next = newNode;
}

void sorteddesc(int data){
Node newNode = new Node(data);
Node currNode = head;
if(currNode == null || currNode.data <data){
newNode.next = head;
head = newNode;
return;
}
while(currNode.next != null && currNode.next.data > data){
currNode = currNode.next;
}
newNode.next = currNode.next;
currNode.next = newNode;
}
void printList(){
if(head== null){
System.out.println("List is empty");
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
class ll6{
public static void main(String [] args){
LinkedList6 list = new LinkedList6();
/*list.sortedasc(5);
list.sortedasc(1);
list.sortedasc(7);
list.sortedasc(11);
list.printList();*/
list.sorteddesc(3);
list.sorteddesc(1);
list.sorteddesc(6);
list.sorteddesc(4);
list.printList();
}
}

/*
for ascending

C:\Users\ankur\Desktop\Utkarsh\Javanote>javac ll6.java

C:\Users\ankur\Desktop\Utkarsh\Javanote>java ll6
1 =>5 =>7 =>11 =>Null

for descending
C:\Users\ankur\Desktop\Utkarsh\Javanote>javac ll6.java

C:\Users\ankur\Desktop\Utkarsh\Javanote>java ll6
6 =>4 =>3 =>1 =>Null
*/
