package DP;

import java.util.*;

public class CatalansNumber {
    public static int catalanRecursion(int n){
        
        if(n == 0 || n == 1){
            return 1;
        }
        int ans = 0;
        for(int i =0;i<=n-1;i++)
        {
            
            ans += catalanRecursion(i)*catalanRecursion(n-i-1);
        }
        return ans;
    }
    public static int catalansMemo(int n ,int dp[]){
        if(n == 0 || n == 1){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int ans =0;
        for(int i=0;i<n;i++){
            ans += catalansMemo(i,dp)*catalansMemo(n-i-1,dp);
        }
        return dp[n]=ans;
    }
    public static int catalansTabulation(int n){//tabulation = O(n^2)
        int dp[] = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n =4;
        // System.out.println(catalanRecursion(n));
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(catalansTabulation(n));
    }
}
