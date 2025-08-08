public class basicLinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node n1 = new Node(5);
        Node n = n1;
        int j=23;
        for(int i=1; i<4; i++){
            
            n.next = new Node(j);
            n=n.next;
            j--;
        }
        
        Node n2 = n1;
        for(int i=1; i<5; i++){
            System.out.println(n2.data);
            n2= n2.next;
        }

        // delete second node 

      
    }
}
