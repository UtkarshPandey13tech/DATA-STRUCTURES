//insert sorted DLL IN ASC ORDER
class DLL4{
Node head;
int size;
class Node{
int data;
Node next;
Node prev;
Node(int data , Node next , Node prev){
this.data = data;
this.next=next;
this.prev=prev;
 size++;
}
}
void traverse(){
if(head ==null){
System.out.println("List is Empty");
return;
}
Node currNode = head;
while(currNode != null){
System.out.print(currNode.data +"=>");
currNode = currNode.next;
}
System.out.println("NULL");
}

void SortedInsertAsc(int data){
Node newNode = new Node(data , null , null);
Node currNode = head;
if(currNode == null){
head = newNode;
return;
}
if(currNode.data>data){
newNode.next = head;
head.prev = newNode;
head = newNode;
return;
}
while(currNode.next!=null && currNode.next.data<data){
currNode=currNode.next;
}
if(currNode.next!=null){
newNode.next = currNode.next;
currNode.next.prev = newNode;
newNode.prev = currNode;
currNode.next = newNode;
}
else{
currNode.next=newNode;
newNode.prev = currNode;
}
}
}

class ll21{
public static void main(String [] args){
DLL4 li = new DLL4();
li.SortedInsertAsc(333);
li.SortedInsertAsc(111);
li.SortedInsertAsc(999);
li.SortedInsertAsc(444);
li.SortedInsertAsc(222);
li.SortedInsertAsc(888);
li.traverse();
}
}
/*

C:\Users\ankur\Desktop\Utkarsh\Javanote>javac ll21.java
C:\Users\ankur\Desktop\Utkarsh\Javanote>java ll21
111=>222=>333=>444=>888=>999=>NULL

*/

