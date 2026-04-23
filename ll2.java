// linked list 2 print to first and last 
class linkedList2{
Node head;
class Node{
int data;
Node next;
Node(int data){
this.data = data;
this.next = null;
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
Node temp = head;
while(temp.next != null){
temp = temp.next;
}
temp.next = newNode;
}
void printlist(){
if(head == null){
System.out.println("List is empty");
return;}
Node temp=head;
while(temp != null){
System.out.print(temp.data+"=>");
temp = temp.next;
}
System.out.println("Null");
}
}


public class ll2{
public static void main(String [] args){
linkedList2 List = new linkedList2();
List.addFirst(111);
List.addFirst(222);
List.addFirst(333);
List.addLast(444);
List.printlist();

}
}

/*

C:\Users\ankur\Desktop\Utkarsh\Javanote>javac ll2.java

C:\Users\ankur\Desktop\Utkarsh\Javanote>java ll2
333=>222=>111=>444=>Null

*/