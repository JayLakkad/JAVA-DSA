package Recursion;
public class TillingProblem {
    public static void main(String[] args) {
         int n = 4 ;
        System.out.println(Tilling(n));
    }
    public static int Tilling(int n ){
        if(n==0 || n==1){
            return 1;

        }
        int verticalTiles= Tilling(n-1);
        int horizontalTiles = Tilling(n-2);
        int TotalTiles = verticalTiles+horizontalTiles;
        return TotalTiles;
    }
}
