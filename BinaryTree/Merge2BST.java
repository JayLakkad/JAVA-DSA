import java.util.*;
public class Merge2BST{
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void inorder(Node root,ArrayList<Integer>result){
        if(root == null)
        {
            return;
        }
        inorder(root.left,result);
        result.add(root.data);
        inorder(root.right,result);
    }
    public static Node createBST(ArrayList<Integer>result,int st,int end){
        if(st>end)
        {
            return null;
        }
        int mid = (st + end)/2;
        Node root= new Node(result.get(mid));
        root.left = createBST(result, st, mid-1);
        root.right = createBST(result, mid+1, end);
        return root;
    }
    public static Node mergeBST(Node root,Node head){
        ArrayList<Integer>result = new ArrayList<>();
        inorder(root,result);
        inorder(head,result);
        Collections.sort(result);
         root=createBST(result,0,result.size()-1);
         return root;
    }
    public static void preorder(Node root){
        if(root == null)
        {
            return ;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(4);

        Node head = new Node(9);
        head.left = new Node(3);
        head.right = new Node(12);

        root = mergeBST(root, head);
        preorder(root);

    }
}