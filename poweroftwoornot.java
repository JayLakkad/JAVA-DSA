public class poweroftwoornot {
    public static boolean isPowerofTwo(int n){
       
        if((n & n-1)==0)
        {
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        int n =16;
        System.out.println(isPowerofTwo(n));
    }
}
