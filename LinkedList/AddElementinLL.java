class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class AddElementinLL {
    public static Node head;

    public static void addNodeatEnd(){
        Node newNode = new Node(3);

        if(head == null){
            head = newNode; // Fix: Assign newNode to head
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public static void printAllNode(){
        if(head == null){
            return;
        }

        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
  
    public static boolean checkIsKeyPresentOrNot(int key){
        if(head == null){
            return false;
        }

        Node current = head;

        while(current != null){
            if(current.data == key){
                return true;
            }
            current= current.next;
        }
        return false;
    }

    public static void addNodeatFirst(int data){
       Node newNode = new Node(data);
       if(head ==null){
          head= newNode;
       }

       newNode.next = head;
       head = newNode;
    }
    
    public static void deleteNodeAtFirst(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }

        head = head.next;
        
    }
    
    public static void deleteNodeAtLast(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }

        Node curNode = head;
        while(curNode.next.next != null){
            curNode = curNode.next;
        }
        curNode.next=null;
    }
    
    public static int lengthOfLL(){
        if(head ==  null){
            return 0;
        }
        Node curNode = head;
        int count =1;
        while(curNode.next!= null){
            count++;
            curNode= curNode.next;
        }

        return count;
    }
    
    public static boolean isCircularLL(){
        if(head == null){
            return false;
        }
        if(head.next ==null){
            return false;
        }

        Node curNode = head;
        while(curNode.next !=null){
              if(curNode.next==head){
                return true;
              }
              curNode=curNode.next;
        }
        return false;
    }
    
  public static void addInMiddle() {
    if (head == null || head.next == null) {
        System.out.println("Not possible");
        return;
    }

    Node newNode = new Node(23);
    Node curr = head;
    int count = 0;

    // Count the number of nodes
    while (curr != null) {
        count++;
        curr = curr.next;
    }

    // Reset to head
    curr = head;

    // Move to middle node (floor(count / 2) - 1 steps for 0-based index)
    for (int i = 0; i < (count / 2) - 1; i++) {
        curr = curr.next;
    }

    // Insert the new node after current
    newNode.next = curr.next;
    curr.next = newNode;
}

    public static void main(String[] args) {
        addNodeatEnd(); // adds 3
        addNodeatEnd(); // adds another 3
        printAllNode(); // should print 3 3
        System.out.println(checkIsKeyPresentOrNot(32));
        addNodeatFirst(34);
        printAllNode(); 
        deleteNodeAtFirst();
        printAllNode(); 
        
        System.out.println('d');
        printAllNode();
        System.out.println("the length of current linked list is "+lengthOfLL());
        addNodeatEnd();
        addNodeatEnd();
        addNodeatEnd();
         System.out.println("the length of current linked list is "+lengthOfLL());
         printAllNode();
        System.out.println(isCircularLL());
        addInMiddle();
        printAllNode();
        System.out.println('h');
           addInMiddle();
        printAllNode();
    }
    
}
