package Recursion;
public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 90;
        System.out.println(findFibonacci(n));
    }
    public static int findFibonacci(int n ){
        if(n==0){
            return 0 ;
        }
        if(n == 1)
        {
            return 1;

        }
        return findFibonacci(n-1)+findFibonacci(n-2);
    }
}
