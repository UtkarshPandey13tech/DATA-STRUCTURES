//linked find nth node from ending and beginning
class SLL4{
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
Node(int data , Node temp){
this.data = data;
this.next = temp;
size++;
}
}
int getSize(){
return this.size;
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
System.out.println("List is empty");
return;
}
Node currNode = head;
while(currNode != null) {
System.out.print(currNode.data+ "=>");
currNode = currNode.next;
}
System.out.println("Null");
}
int nthNodefromBegin(int index){
if(index>getSize() || index<1){
return -1;
}
int count=0;
Node currNode = head;
while(currNode!=null && count <index-1){
count++;
currNode= currNode.next;
}
return currNode.data;
}
int nthNodefromEnd(int index){
int size = getSize();
int sindex;
if(size !=0 && size<index){
return -1;
}
sindex = size - index +1;
return nthNodefromBegin(sindex);
}
} 

class ll17{
public static void main(String [] args){
SLL4 list = new SLL4();
list.addLast(111);
list.addLast(222);
list.addLast(555);
list.addLast(333);
list.addLast(777);
list.printList();
System.out.println(list.nthNodefromBegin(3));
System.out.println(list.nthNodefromEnd(2));
}
}
/*

C:\Users\ankur\Desktop\Utkarsh\Javanote>javac ll17.java
C:\Users\ankur\Desktop\Utkarsh\Javanote>java ll17
111=>222=>555=>333=>777=>Null
555
333
*/

