//doubly linked list
class DLL{
int size;
Node head;
class Node{
int data;
Node next;
Node prev;
Node(int data , Node next, Node prev){
this.data = data;
this.next= next;
this.prev = prev;
size++;
}
}
void traverse(){
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
void addFirst(int data){
Node newNode;
if(size ==0){
newNode = new Node(data , null , null);
head = newNode;
}
else{
newNode = new Node(data , null , null);
head.prev = newNode;
newNode.next = head;
head = newNode;
}
}
}
class ll18{
public static void main(String [] args){
DLL li = new DLL();
li.addFirst(22);
li.addFirst(33);
li.addFirst(44);
li.traverse();
}
}
/*
C:\Users\ankur\Desktop\Utkarsh\Javanote>javac ll18.java
C:\Users\ankur\Desktop\Utkarsh\Javanote>java ll18
44=>33=>22=>Null
*/