public class PrintNumbersinDecresingOrder {
    public static void main(String[] args) {
        int n =10;
        printNumbers(n);
    }
    public static void printNumbers(int n ){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printNumbers(n-1);
    }
}
    

