package DP;

public class coinchange {
    public static int calculateCoinChange(int coins[], int sum){
        int n = coins.length;
        int dp[][] = new int[n+1][sum+1];

        //initialization
        for(int i =0;i<n+1;i++){
            dp[i][0]=1;

        }
        
        for(int j =1;j<sum+1;j++){
            dp[0][j] =0;
        }
        for(int i =1;i<n+1;i++){//O(n*sum)
            for(int j =1;j<sum+1;j++){
                if(coins[i-1] <= j){//valid
                    dp[i][j]=dp[i][j-coins[i-1]] + dp[i-1][j];
                }
                else{//invalid
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int coins[]= {1,2,5};
        int sum =5;
        System.out.println(calculateCoinChange(coins, sum));
}
}
