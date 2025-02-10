package DP;

public class WildCardMatching {
    public static boolean isMatch(String s, String p){//complexity - O(n*m)
        int n = s.length();
        int m = p.length();
        boolean dp[][] = new boolean[n+1][m+1];
        dp[0][0]=true;//initialize
        for(int i=1;i<n+1;i++){//pattern is empty
            dp[i][0]=false;
        }
        for(int j=1;j<m+1;j++)//String is empty
        {
            if(p.charAt(j-1) == '*'){
                dp[0][j] = dp[0][j-1];
            }
        }
        //bottom-up
        for(int i=1;i<n+1;i++){
            for(int j =1;j<m+1;j++){
                //case -> ith char == jth char || jth char == ?
                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?'){
                    dp[i][j]=dp[i-1][j-1];
                }
                else if(p.charAt(j-1) == '*'){
                    dp[i][j]=dp[i-1][j] || dp[i][j-1];
                }
                else{
                    dp[i][j]=false;
                }
            }
            
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String s = "abc";
        String p = "**d";
        System.out.println(isMatch(s, p));
    }
}
