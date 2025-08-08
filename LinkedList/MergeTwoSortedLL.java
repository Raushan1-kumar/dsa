class Node {
    int data;
    Node next;
    public Node(int data){
        this.data= data;
        this.next = null;
    }
}

public class MergeTwoSortedLL {
    public static void main(String[] args) {
        Node head = new Node(2);
        Node head2 = new Node(5);
        Node temp1 = head;
        Node temp2 = head2;

        temp1.next = new Node(3);
        temp1.next.next = new Node(7);

        temp2.next = new Node(6);
        temp2.next.next = new Node(9);

     
        System.out.print("List 1: ");
        printList(head);
        System.out.print("List 2: ");
        printList(head2);

    
        temp1 = head;
        temp2 = head2;

        
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (temp1 != null && temp2 != null) {
            if (temp1.data < temp2.data) {
                temp.next = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }

        // Attach remaining nodes
        if (temp1 != null) temp.next = temp1;
        if (temp2 != null) temp.next = temp2;

        System.out.print("Merged List: ");
        printList(dummy.next);
    }

    public static void printList(Node head) {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
