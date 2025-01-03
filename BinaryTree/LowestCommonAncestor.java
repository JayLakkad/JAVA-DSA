import java.util.*;
public class LowestCommonAncestor {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data= data;
            this.left= null;
            this.right=null;
        }
    }
    public static boolean getpath(Node root,int n,ArrayList<Node>path){
        if(root==null)
        {
            return false;
        }
        path.add(root);
        if(root.data == n)
        {
            return true;
        }
        boolean left = getpath(root.left,n,path);
        boolean right = getpath(root.right,n,path);
        if(left || right){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static Node lca1(Node root,int n1,int n2)//approach 1-O(n)
    {
        ArrayList<Node>path1 = new ArrayList<>();
        ArrayList<Node>path2 = new ArrayList<>();
        getpath(root,n1,path1);
        getpath(root,n2,path2);
        int i =0;
       while(i<path1.size()&& i<path2.size()){
            if(path1.get(i) != path2.get(i)){
                break;
            }
            i++;
       }

        Node lca = path1.get(i-1);
        return lca;
    }
    public static Node lca2(Node root,int n1,int n2)
    {
        if(root == null)
        {
            return null;
        }
        if(root.data == n1 || root.data==n2)
        {
            return root;
        }
        Node left = lca2(root.left,n1,n2);
        Node right = lca2(root.right,n1,n2);
        if(right == null)
        {
            return left;
        }
        if(left == null)
        {
            return right;
        }
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        int n1 =4;
        int n2 =6;
        System.out.println(lca1(root,n1,n2).data); 
        System.out.println(lca2(root,n1,n2).data);
    }
}
