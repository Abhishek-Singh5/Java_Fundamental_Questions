import java.util.*;
class Main {
    static Scanner s1 = new Scanner(System.in);
    
    static Node createTree(){
        Node root = null;
        System.out.println("Enter data:- ");
        int data = s1.nextInt();
        if(data == -1) return null;
        root = new Node(data);
        System.out.println("Enter left for " + data);
        root.left = createTree();
        System.out.println("Enter right for " + data);
        root.right = createTree();
        return root;
    }
    
    static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data+ " ");
        inOrder(root.right);
    }
    
    public static void main(String []k){
        Node root = createTree();
        System.out.println("inOrder Traversal");
        inOrder(root);
        
    }
}

class Node {
    Node left, right;
    int data;
    
    public Node(int data) {
        this.data = data;
    }
}