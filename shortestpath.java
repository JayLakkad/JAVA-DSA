public class shortestpath {
    public static float calculateShortestPath(String str)
    {
        int n = str.length();
        int y = 0;
        int x =0;
        for(int i =0 ; i<n;i++)
        {
            if(str.charAt(i)=='N')
            {
                y++;
            }
            else if(str.charAt(i)=='S')
            {
                y--;
            }
            else if(str.charAt(i)=='E')
            {
                x++;
            }
            else{
                x--;
            }
        }
        int X2= x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(calculateShortestPath(str));
    }
}

