public class GridWays {
    public static void main(String[] args) {
        //only right and down move is allowed
        //and we have to find the no of ways to go from source cell to destination cell
        int n=10,m=10;
        System.out.println("Total possible ways: "+findways(0,0,n,m));
    }
    public static int findways(int i, int j , int n,int m)//exponential time
    {
        // base
        if(i==n-1 && j ==m-1){//condition for last cell
            return 1;
        }
        else if(i==n || j==n)//boundary cross condition
        {
            return 0;
        }
        // kaam
        int w1 = findways(i+1, j, n, m);
        int w2 = findways(i, j+1, n, m);
        return w1+w2;
    }
}
