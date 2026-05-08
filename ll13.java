//linked list copyreversed list
class SLL{
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
Node(int data , Node temp){
this.data = data;
this.next=temp;
size++;
}
}
void SortedAsc(int data){
Node newNode = new Node(data);
Node currNode = head;
if(currNode == null || currNode.data>data){
newNode.next = head;
head = newNode;
return;
}
while(currNode.next != null && currNode.next.data<data){
currNode = currNode.next;
}
newNode.next = currNode.next;
currNode.next = newNode;
}
void printList(){
if(head == null){
System.out.println("list is empty");
return;
}
Node currNode = head;
while(currNode != null){
System.out.print(currNode.data +" =>");
currNode = currNode.next;
}
System.out.println("Null");
}
SLL copyReversed(){
Node temp1=null,temp2=null,currNode = head;
while(currNode != null){
temp2 = new Node(currNode.data , temp1);
currNode = currNode.next;
temp1=temp2;
}
SLL obj = new SLL();
obj.head = temp1;
return obj;
}
}
class ll13{
public static void main(String [] args){
SLL list = new SLL();
list.SortedAsc(111);
list.SortedAsc(222);
list.SortedAsc(999);
list.SortedAsc(444);
list.SortedAsc(555);
list.SortedAsc(666);
list.SortedAsc(777);
list.printList();
SLL li = new SLL();
li = list.copyReversed();
li.printList();
}
}
/*
C:\Users\ankur\Desktop\Utkarsh\Javanote>javac ll13.java
C:\Users\ankur\Desktop\Utkarsh\Javanote>java ll13
111 =>222 =>444 =>555 =>666 =>777 =>999 =>Null
999 =>777 =>666 =>555 =>444 =>222 =>111 =>Null

*/