
package BST;
import java.util.*;
public class buildBST {
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
    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right,val);
        }
        return root; 

    }
    public static void inorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(Node root,int key)//time complexity->O(H),where H->height of the tree
    {
        if(root == null)
        {
            return false;
        }
        if(root.data == key)
        {
            return true;
        }
        if(root.data>key){
            return search(root.left,key);

        }
        else{
            return search(root.right,key);
        }
        
    }
    public static Node findInorderSuccessor(Node root){
        while(root.left != null)
        {
            root = root.left;
        }
        return root;
    }
    public static Node delete(Node root,int val){
        if(root.data<val)
        {
            root.right = delete(root.right,val);
        }
        else if(root.data>val)
        {
            root.left = delete(root.left,val);
        }
        else{
            //case 1 : leaf node
            if(root.left == null && root.right == null)
            {
                return null;
            }
            //case 2 - single child
            if(root.left == null)
            {
                return root.right;
            }
            else if(root.right == null)
            {
                return root.left;
            }
            //case 3:both children

            Node Is = findInorderSuccessor(root.right);
            root.data = Is.data;
            root.right=delete(root.right,Is.data);

        }
        return root;
    }
    public static void printInRange(Node root,int k1,int k2){
        if(root == null)
        {
            return;
        }
        
        if(root.data >=k1 && root.data<=k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right,k1,k2);
        }
        else if(root.data<k1){
            printInRange(root.left, k1, k2);
        }
        else{
            printInRange(root.right, k1, k2);
        }
    }
    public static void printPath(ArrayList<Integer>path){
        for(int i =0;i<path.size();i++)
        {
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }
    public static void printRootToLeaf(Node root,ArrayList<Integer>path){
        if(root == null)
        {
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);
        path.remove(path.size()-1);

    }

    public static boolean isValidBST(Node root,Node min,Node max){
        if(root == null)
        {
            return true;
        }
        if(min != null && root.data <=min.data)
        {
            return false;
        }
        else if(max!= null && root.data>=max.data)
        {
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }
    
    public static void main(String[] args) {
        int [] arr = {8,5,3,6,10,11,14};
        Node root = null;
        for(int i =0 ;i<arr.length;i++)
        { 
            root = insert(root,arr[i]);
        }
        inorder(root);
        System.out.println();
        
        if(isValidBST(root, null, null))
        {
            System.out.println("Valid");
        }
        else{
            System.out.println("Not Valid");
        }
    }
}
