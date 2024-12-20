public class printSubarrays {
    public static void subarrays(int[]arr){
        int total = 0;
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0 ; i<n ; i++)
        {
            for(int j = i;j<n;j++)
            {
                int sum = 0;
                for(int k =i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                    sum += arr[k];
                }
                total++;
                System.out.println("="+sum);
                max = Math.max(max,sum);
                min = Math.min(min,sum);
            }
            System.out.println();
        }
        System.out.println("Total number of subarrays are: "+total);
        System.out.println("Maximum sum of subarrays is: "+max);
        System.out.println("Minimum sum of subarrays is: "+min);
    }
    public static void main(String[] args) {
        int [] numbers = {2,4,6,8,10};
        subarrays(numbers);
    }
}
