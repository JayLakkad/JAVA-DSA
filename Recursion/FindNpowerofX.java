package Recursion;
public class FindNpowerofX {
    public static void main(String[] args) {
        int x = 5;
        int n =5;
        System.out.println(Power(x,n));
    }
    // public static int Power(int x,int n){//O(n)
    //     if(n==0){
    //         return 1;
    //     }
    //     return x*Power(x,n-1);
    // }
    public static int Power(int x, int n ){//O(logn) 
         if(n==0){
            return 1;

         }
         int temp = Power(x,n/2);
            temp = temp*temp;
            if(n%2==0){
                return temp;
            }
            return temp*x;
    }
}
