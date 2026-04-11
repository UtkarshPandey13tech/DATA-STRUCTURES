// linked list --1
class LinkedList1 {
    Node head;

    class Node {
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

    void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}

public class ll1 {
    public static void main(String[] args){
        LinkedList1 list = new LinkedList1();

        list.addFirst(33);
        list.addFirst(22);
        list.addFirst(11);

        list.printList();
    }
}

/*


C:\Users\ankur\Desktop\Utkarsh\Javanote>javac ll1.java

C:\Users\ankur\Desktop\Utkarsh\Javanote>java ll1
11 => 22 => 33 => Null
*/