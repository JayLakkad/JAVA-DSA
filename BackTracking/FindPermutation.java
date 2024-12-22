public class FindPermutation {//Enumeration
    //Time Complexity : O(n*n!)
    public static void main(String[] args) {
        String str = "abc";
        permutations(str,"");
    }
    public static void permutations(String str,String ans){
        //base
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i =0 ; i<str.length();i++)
        {
            char curr = str.charAt(i);
            String str1 = str.substring(0, i)+str.substring(i+1);
            permutations(str1,ans+curr);
        }

    }
}
