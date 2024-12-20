public class PrintSumofFirstNNaturalNo {
    public static void main(String[] args) {
        int n  =5;
        System.out.println(findSum(n));
    }
    public static int findSum(int n ){
        if(n==0){
            return 0 ;
        }
        return n+findSum(n-1);
    }
}
