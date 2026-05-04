//linked List delete elements form from first and last
class linkedList7{
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
void deletefirst(){
if(head == null){
System.out.println("list is empty");
return;
}
size--;
head = head.next;
}
void deletelast(){
if(head == null){
System.out.println("List is empty");
return;
}
if(head.next == null){
head = null;
return;
}
size--;
Node temp1 = head,temp2 = head.next;
while(temp2.next != null){
temp2 = temp2.next;
temp1 = temp1.next;
}
temp1.next = null;
}
void printlist(){
if(head == null){
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

class ll7{
public static void main(String [] args){
linkedList7 list = new linkedList7 ();
list.addFirst(333);
list.addFirst(444);
list.addFirst(666);
list.addLast(222);
list.printlist();
list.deletefirst();
list.printlist();
list.deletelast();
list.printlist();

}
}

/*
C:\Users\ankur\Desktop\Utkarsh\Javanote>javac ll7.java

C:\Users\ankur\Desktop\Utkarsh\Javanote>java ll7
666 =>444 =>333 =>222 =>Null
444 =>333 =>222 =>Null
444 =>333 =>Null
*/