// 1. Preorder Traversal: Visit the root node first, then recursively visit the left subtree, followed by the right subtree.
// 2. Inorder Traversal: Recursively visit the left subtree first, then visit the root node, and finally the right subtree.
// 3. Postorder Traversal: Recursively visit the left subtree first, then the right subtree, and finally visit the root node.
// 4. Level Order Traversal: Visit all nodes at the present depth level before moving on to nodes at the next depth level.
// 5. Reverse Level Order Traversal: Visit all nodes at the present depth level in reverse order before moving on to nodes at the next depth level.
// 6. Spiral Order Traversal: Visit nodes in a spiral order, alternating between left-to-right and right-to-left at each level.
// 7. Boundary Traversal: Visit the boundary nodes of the tree in a specific order, including the left boundary, leaf nodes, and right boundary.
// 8. Morris Traversal: A space-efficient traversal method that uses the tree structure itself to traverse without using a stack or recursion.
// 9. Zigzag Level Order Traversal: Visit nodes in a zigzag pattern, alternating between left-to-right and right-to-left at each level.
// 10. Vertical Order Traversal: Visit nodes in a vertical order, grouping nodes that are at the same horizontal distance from the root node.
// 11. Diagonal Traversal: Visit nodes in a diagonal order, grouping nodes that are on the same diagonal line.
// 12. Random Order Traversal: Visit nodes in a random order, which may not follow any specific pattern or structure.
// 13. Custom Order Traversal: Visit nodes in a custom order defined by a specific condition or rule, which may vary based on the problem requirements.





class Node{
    int data;
    Node left, right;
    Node(int item){
        data=item;
        left=right=null;
    }
}


public class TraversalOfTree {

    Node root;
 
    void inorder(Node node) {
        if(node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);    
    }


    void preorder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.data+"");
        preorder(node.left);
        preorder(node.right);
    }


    void postorder(Node node){
        if(node == null){
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data+"");

    }



     public static void main(String[] args) {
     



     }
}














































