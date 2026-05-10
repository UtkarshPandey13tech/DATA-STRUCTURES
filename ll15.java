//linked list comparing two list
class SLL2{
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
Node(int data , Node temp){
this.data= data;
this.next=temp;
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
System.out.println("List is empty");
return;
}
Node currNode = head;
while(currNode != null){
System.out.print(currNode.data + "=>");
currNode = currNode.next;
}
System.out.println("Null");
}

Boolean compareList1(SLL2 list){
Node head1=head , head2=list.head;
while(head!= null && head2 != null){
if(head1.data != head2.data){
return false;
}
head1 = head1.next;
head2 = head2.next;
}
if(head1 == null && head2 == null){
return true;
}
return false;
}
}
class ll15 {
public static void main(String [] args){
SLL2 li1 = new SLL2();
li1.addLast(11);
li1.addLast(22);
//li1.addLast(33);
li1.addLast(55);
li1.addLast(44);
li1.printList();
SLL2 li2 = new SLL2();
li2.addLast(11);
li2.addLast(22);
li2.addLast(33);
li2.addLast(44);
li2.printList();

System.out.println(li1.compareList1(li2));
}
}
/*
C:\Users\ankur\Desktop\Utkarsh\Javanote>javac ll15.java

C:\Users\ankur\Desktop\Utkarsh\Javanote>java ll15
11=>22=>33=>44=>Null
11=>22=>33=>44=>Null
true

C:\Users\ankur\Desktop\Utkarsh\Javanote>javac ll15.java

C:\Users\ankur\Desktop\Utkarsh\Javanote>java ll15
11=>22=>55=>44=>Null
11=>22=>33=>44=>Null
false
*/