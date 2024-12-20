package Recursion;
public class BinaryStringProblem {
    public static void main(String[] args) {
        printBinaryStrings(4, 0,"");
    }
    public static void printBinaryStrings(int n,int lastplace,String str){
        //base case
        if(n==0)
        {
            System.out.println(str);
            return;
        }
        //kaam
        printBinaryStrings(n-1,0, str+"0");
        if(lastplace == 0)
        {
            printBinaryStrings(n-1, 1, str+"1");
        }

    }
}
