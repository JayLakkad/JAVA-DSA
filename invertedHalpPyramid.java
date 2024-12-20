public class invertedHalpPyramid {
    public static void inverted_half_pyramid(int Rows)
    {
        for(int i = Rows;i>=1;i--){
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_half_pyramid(5);
    }
}
