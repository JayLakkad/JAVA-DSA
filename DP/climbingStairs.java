package DP;


public class climbingStairs {

    // public static int countways(int n){//recursion->O(2^n)
    //     if(n == 0){
    //         return 1;
    //     }
    //     if(n < 0){
    //         return 0;
    //     }
    //     return countways(n-1)+ countways(n-2);
    // }
    // public static int memocountways(int n ,int ways[]){//Memoization->O(n)
    //     if(n == 0){
    //         return 1;
    //     }
    //     if(n < 0){
    //         return 0;
    //     }
    //     if(ways[n]!=-1){//already calculated
    //         return ways[n];
    //     }
    //     ways[n]=memocountways(n-1, ways)+memocountways(n-2, ways);
    //     return ways[n];
    // }

    // //to count ways with 1,2 and 3 jump at a time possible
    // public static int memocount(int n ,int ways[]){
    //     if(n == 0){
    //         return 1;
    //     }
    //     if(n<0){
    //         return 0;
    //     }
    //     if(ways[n]!=-1){
    //         return ways[n];
    //     }
    //     ways[n] = memocount(n-1, ways)+memocount(n-2, ways)+memocount(n-3, ways);
    //     return ways[n];

    // }
    public static int tabulationcountways(int n){//Tabulation->O(n)
        int dp [] =new int[n+1];
        dp[0]=1;

        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i]=dp[i-1]+0;
            }
            else{
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n =5;
        System.out.println(tabulationcountways(n));
    }
}
