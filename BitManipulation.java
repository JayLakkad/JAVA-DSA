public class BitManipulation {
    public static void checkOddOrEven(int n )//odd or even using bit manipulation
    {
        int bitMask = 1;
        if((n & bitMask) == 1)
        {
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
    // public static int getIthBit(int n,int i )//get ith bit of a number
    // {
    //     int bitMast = 1<<i;
    //     if((n&bitMast) == 0)
    //     {
    //         return 0;
    //     }
    //     else{
    //         return 1;
    //     }
    // }
    // public static int setIthBit(int n , int i )//set ith bit of a number
    // {
    //    int bitMask = 1<<i;
    //    return  n | bitMask;
    // }
    // public static int clearIthBit(int n, int i )//clear ith bit of a number
    // {
    //     int bitMask = ~(1<<i);
    //     return n&bitMask;
    // }
    // public static int updateIthbit(int n , int i,int newbit){//update ith bit of a number
    //    int bitMask = ~(1<<i);
    //    n=n&bitMask;
    //    int bit = newbit<<i;
    //    return n|bit;
    // }
    // public static int clearLastIbits(int n, int i){//clear last i bits of a number
    //     int bitMask = (-1<<i);//~(0)<<i can also be used as bit mask here
    //     return n&bitMask;
    // }

    public static int clearRangeofBits(int n , int i ,int j){//clear range of bits from i to j
       int a = -1<<(j+1);
       int b = (1<<i)-1;
       int bitmask = a|b;
       return n&bitmask;

    }
    
    public static void main(String[] args) {
        // int n = 15;
        // int i =2;
        // checkOddOrEven(n);
        // System.out.println(setIthBit(n,i));
        // System.out.println(clearIthBit(n,i));
        // System.out.println(getIthBit(n,i));
        // System.out.println(updateIthbit(n,i,1));
        // System.out.println(clearLastIbits(n,i));
        System.out.println(clearRangeofBits(10,2,4));
    }
}
