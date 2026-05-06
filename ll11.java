//reversed the linked list
class LinkedList11{
Node head;
int size;
class Node{
int data;
Node next;
Node(int data){
this.data = data;
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
newNode.next= head;
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
void reverse(){
Node curr = head , prev = null , next=null;
while(curr != null){
next = curr.next;
curr.next = prev;
prev = curr;
curr = next;
}
head = prev;
}
void printlist(){
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
}

class ll11{
public static void main(String [] args){
LinkedList11 li = new LinkedList11();
li.addFirst(222);
li.addFirst(111);
li.addFirst(333);
li.addLast(555);
li.addLast(666);
li.addLast(777);
li.addLast(444);
System.out.print("Original: ");
li.printlist();
System.out.println();
li.reverse();
System.out.print("Reversed: ");
li.printlist();

}
}

/*
C:\Users\ankur\Desktop\Utkarsh\Javanote>javac ll11.java

C:\Users\ankur\Desktop\Utkarsh\Javanote>java ll11
Original: 333=>111=>222=>555=>666=>777=>444=>Null

Reversed: 444=>777=>666=>555=>222=>111=>333=>Null
*/
