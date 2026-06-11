//insert at specific position
class DLL3{
Node head;
int size;
class Node{
int data;
Node next;
Node prev;
Node(int data , Node next , Node prev){
this.data= data;
this.next = next;
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
while(currNode!= null){
System.out.print(currNode.data +"=>");
currNode= currNode.next;
}
System.out.println("Null");
}
void addLast(int data){
Node newNode = new Node(data , null , null);
if(head == null){
head = newNode;

}
else{
Node currNode = head;
while(currNode.next != null){
currNode = currNode.next;
}
currNode.next = newNode;
newNode.prev = currNode;
} 
}

void addPos(int data,int pos){
int i=0;
if(pos<0 || pos>size){
System.out.println("Out of Range");
return;
}
Node newNode = new Node(data , null , null);
if(head == null){
head= newNode;
return;
}
if(pos!=0){
Node currNode =head , temp=null;
while(currNode.next != null && i<pos){
temp = currNode;
currNode = currNode.next;
i++;
}
temp.next=newNode;
newNode.prev = temp;
newNode.next=currNode;
currNode.prev = newNode;
}
else{
newNode.next=head;
head.prev = newNode;
head= newNode;
}
}
}
class ll20{
public static void main(String [] args){
DLL3 li = new DLL3();
li.addLast(333);
li.addLast(555);
li.addLast(111);
li.addLast(222);
li.addLast(444);
li.traverse();
li.addPos(999,0);
li.traverse();
}
}
/*
C:\Users\ankur\Desktop\Utkarsh\Javanote>javac ll20.java
C:\Users\ankur\Desktop\Utkarsh\Javanote>java ll20
333=>555=>111=>222=>444=>Null
333=>999=>555=>111=>222=>444=>Null

*/

