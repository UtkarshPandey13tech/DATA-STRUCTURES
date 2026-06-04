//linked list comparing two function by iterative method
class SLL3{
Node head;
int size;
class Node{
int data ;
Node next;
Node(int data){
this.data= data;
this.next= null;
size++;
}
Node( int data , Node temp){
this.data= data;
this.next = temp;
size++;
}
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
System.out.print(currNode.data + "=>");
currNode=currNode.next;
}
System.out.println("Null");
}

boolean compareList2(SLL3 list){
return compareList(head, list.head);
}
Boolean compareList(Node head1, Node head2){
if(head1 == null && head2 == null){
return true;
}
else if(head1==null || head2 == null || (head1.data != head2.data)){
return false;
}
else {
return compareList(head1.next , head2.next);
}
}
}
class ll16 {
public static void main(String [] args){
SLL3 li1 = new SLL3();
li1.addLast(11);
li1.addLast(22);
li1.addLast(33);
//li1.addLast(55);
li1.addLast(44);
li1.printList();
SLL3 li2 = new SLL3();
li2.addLast(11);
li2.addLast(22);
li2.addLast(33);
li2.addLast(44);
li2.printList();

System.out.println(li1.compareList2(li2));
}
}
/*
C:\Users\ankur\Desktop\Utkarsh\Javanote>javac ll16.java
C:\Users\ankur\Desktop\Utkarsh\Javanote>java ll16
11=>22=>55=>44=>Null
11=>22=>33=>44=>Null
false

C:\Users\ankur\Desktop\Utkarsh\Javanote>javac ll16.java
C:\Users\ankur\Desktop\Utkarsh\Javanote>java ll16
11=>22=>33=>44=>Null
11=>22=>33=>44=>Null
true
*/
