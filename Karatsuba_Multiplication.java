public class Karatsuba_Multiplication {
    public static long karatsuba(long a, long b){
        if(a<10 || b<10){
            return a*b;
        }
        long half = Math.max(Long.toString(a).length(), Long.toString(b).length()) / 2;
        long power = (long)Math.pow(10,half);
        long a1 = a/power;
        long a0 = a%power;
        long b1 = b/power;
        long b0 = b%power;
        long ac = karatsuba(a1,b1);
        long bd = karatsuba(a0,b0);
        long abcd = karatsuba(a1+a0,b1+b0);
        return ac*(long)Math.pow(10,2*half) + (abcd-ac-bd)*(long)Math.pow(10,half) + bd;
    }

    public static void main(String[] args) {
        long a = 1234;
        long b = 1234;
        System.out.println(karatsuba(a,b));
    }
}
