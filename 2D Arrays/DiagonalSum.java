public class DiagonalSum {
    public static int diagonalsum(int [][] arr)
    {
        int n = arr.length;
        // int m =arr[0].length;
        // int sum = 0;
        // for(int i =0;i<n;i++)//O(n^2)
        // {
        //     for(int j =0;j<m;j++)
        //     {
        //         if(i==j)
        //         {
        //             sum+=arr[i][j];
        //         }
        //         else if(i+j == n-1)
        //         {
        //             sum+=arr[i][j];
        //         }
        //     }
            

        // }

        //2nd approach for linear complexity
        int sum = 0;
        for(int i =0; i<n;i++)//O(n)
        {
            sum+=arr[i][i];
            if(i!=n-i-1)//i+j=n-1  so,j=n-1-i
            {
                sum+=arr[i][n-1-i];
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int [][]matrix= {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("The sum of the diagonals is: "+diagonalsum(matrix));
    }
}
