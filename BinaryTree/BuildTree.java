import java.util.*;

class BuildTree{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right= null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public  Node buildTree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = buildTree(nodes);
            newnode.right= buildTree(nodes);
            return newnode;

        }
        public void preOrder(Node root){//preOrder traversal-O(n)
            if(root == null)
            {
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);

        }
        public void inOrder(Node root){//inOrder traversal-O(n)
            if(root == null)
            {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        public void postOrder(Node root){
            if(root ==null)
            {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
        public void levelOrder(Node root){//leverOrder traversal-O(n)
            if(root == null)
            {
                return;
            }     
            Queue<Node>q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty())
            {
                Node currNode = q.remove();
                if(currNode == null)
                {
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);                    
                    }
                }
                else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null)
                    {
                        q.add(currNode.left);
                    }
                    if(currNode.right != null)
                    {
                        q.add(currNode.right);
                    }
                }


            }
        }
       
         
    }
    public static void main(String[] args) {//O(n)
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        tree.preOrder(root);
        System.out.println();
        tree.inOrder(root);
        System.out.println();
        tree.postOrder(root);
        System.out.println();
        tree.levelOrder(root);
    }
    
    
}