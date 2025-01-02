public class FindHeightofTree {
    public static class Node{
        int data;
        Node left,right;

        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root){
        if(root == null)
        {
            return 0;

        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static void printTree(Node root) {
        if (root != null) {
            System.out.print(root.data+" ");
            printTree(root.left);
            printTree(root.right);
        }
    }
    public static int countnodes(Node root){
        if(root == null)
        {
            return 0;
        }
        int lc = countnodes(root.left);
        int rc = countnodes(root.right);
        return lc+rc+1;
    }
    public static int sumofnodes(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftsum = sumofnodes(root.left);
        int rightsum = sumofnodes(root.right);
        return leftsum+rightsum+root.data;
    }
    public static int maxdiameter(Node root){//approach 1-O(n^2)
        if(root == null)
        {
            return 0;
        }
        int ld = maxdiameter(root.left);
        int lh = height(root.left);
        int rd = maxdiameter(root.right);
        int rh = height(root.right);
        int currdia = lh+rh+1;
        return Math.max(Math.max(ld,rd),currdia);
    }
    public static class Info{
        int dia;
        int height;

        public Info(int dia,int height){
            this.dia = dia;
            this.height= height;
        }
    }
    public static Info Maxdiameter(Node root){//approach -2 -O(n)
        if(root==null)
        {
            return new Info(0,0);
        }
        Info leftInfo = Maxdiameter(root.left);
        Info rightInfo = Maxdiameter(root.right);
        int diam = Math.max(Math.max(leftInfo.dia,rightInfo.dia),leftInfo.height+rightInfo.height+1);
        int ht =Math.max(leftInfo.height,rightInfo.height)+1;
        return new Info(diam,ht);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Height of tree: " + height(root));
        System.out.println("Tree nodes:");
        System.out.println("No. of nodes in the give tree: "+countnodes(root));
        System.out.println("Sum of all nodes in the give tree: "+sumofnodes(root));
        printTree(root);
        System.out.println();
        System.out.println("the max diameter of the given tree: "+maxdiameter(root));
        System.out.println("the max diameter of the given tree: "+Maxdiameter(root).dia);
    }
}
