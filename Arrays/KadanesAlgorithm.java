// Only used when there is at least one positive number in the array
public class KadanesAlgorithm {
     public static void kadanealgo(int [] arr)
     {
        int n = arr.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i =0 ; i<n ; i++)
        {
            sum += arr[i];
            if(sum<0)
            {
                sum =0;
            }
            if(sum>max)
            {
                max = sum;
            }
        }
        System.out.println("Maximum sum of subarrays is: "+max);

     }
    public static void main(String[] args) {
        int [] numbers = {-2,-3,4,-1,-2,1,5,-3};
        kadanealgo(numbers);
    }
}
