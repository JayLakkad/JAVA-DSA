public class FindSubsets {
     public static void main(String[] args) {
        String str = "abcd ";
        subsets(str,"",0);

     }
     public static void subsets(String str,String ans, int i){
        //base
        if(i==str.length()){
         if(ans.length()==0)
         {
            System.out.println("null");
         }
         System.out.println(ans);
         return;
        }
        //recursion
        //Yes choice
        subsets(str, ans+str.charAt(i), i+1);
        //No choice
        subsets(str,ans,i+1);

     }
}
