//linked list remove duplicate elements
class LinkedList12{
Node head;
int size;
class Node {
int data;
Node next;
Node(int data){
this.data = data;
this.next=null;
size++;
}
}
void InsertSorted(int data){
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
while (currNode != null){
System.out.print(currNode.data +" =>");
currNode = currNode.next;
}
System.out.println("Null");
} 
void deleteDuplicate(){
Node currNode = head;
while(currNode != null){
if(currNode.next!=null && currNode.data == currNode.next.data){
currNode.next = currNode.next.next;
}
else{
currNode = currNode.next;
}
}
}}
class ll12{
public static void main(String [] args){
LinkedList12 li = new LinkedList12();
li.InsertSorted(333);
li.InsertSorted(111);
li.InsertSorted(888);
li.InsertSorted(222);
li.InsertSorted(111);
li.InsertSorted(333);
li.InsertSorted(111);
li.InsertSorted(999);
li.printList();
li.deleteDuplicate();
li.printList();
}
}

/*
C:\Users\ankur\Desktop\Utkarsh\Javanote>javac ll12.java

C:\Users\ankur\Desktop\Utkarsh\Javanote>java ll12
111 =>111 =>111 =>222 =>333 =>333 =>888 =>999 =>Null
111 =>222 =>333 =>888 =>999 =>Null
*/
