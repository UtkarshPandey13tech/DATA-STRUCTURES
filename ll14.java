//linked list to copy the original list
class SLL1{
Node head;
int size;
class Node{
int data;
Node next;
Node(int data){
this.data=data;
this.next = null;
size++;
}
Node(int data , Node temp){
this.data = data;
this.next = temp;
size++;
}
}
void SortedLL(int data){
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
System.out.println("List is Empty");
return;
}
Node currNode = head;
while(currNode != null){
System.out.print(currNode.data + "=>");
currNode = currNode.next;
}
System.out.println("Null");
}

SLL1 copyList(){
Node headNode = null, tailNode = null, tempNode = null , currNode = head;
if(currNode == null){
return null;
}
headNode = new Node(currNode.data , null);
tailNode = headNode;
currNode = currNode.next;
while(currNode != null){
tempNode = new Node (currNode.data,null);
tailNode.next = tempNode;
tailNode = tempNode;
currNode = currNode.next;
}
SLL1 obj = new SLL1();
obj.head = headNode;
return obj;
}
}

class ll14{
public static void main(String [] args){
SLL1 li = new SLL1();
li.SortedLL(111);
li.SortedLL(333);
li.SortedLL(111);
li.SortedLL(332);
li.SortedLL(444);
li.SortedLL(666);
li.SortedLL(665);
li.SortedLL(77);
li.printList();
SLL1 ll = new SLL1 ();
ll = li.copyList();
li.printList();
}
}

/*

C:\Users\ankur\Desktop\Utkarsh\Javanote>javac ll14.java
C:\Users\ankur\Desktop\Utkarsh\Javanote>java ll14
77=>111=>111=>332=>333=>444=>665=>666=>Null
77=>111=>111=>332=>333=>444=>665=>666=>Null
*/

