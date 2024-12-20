public class prefixsum {
    public static void maxsum(int [] arr)
    {
        int n =arr.length;
        int max = Integer.MIN_VALUE;
        int currsum;
        int [] prefix = new int [n];
        for(int i =0 ; i<n ; i++)
        {
            if(i==0)
            {
                prefix[i]=arr[i];

            }
            else{
                prefix[i]=prefix[i-1]+arr[i];
            }
        }
        for(int i =0; i<n ;i++)
        {
            int start = i;
            for( int j= i ; j<n ; j++)
            {
                int end = j;
                currsum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1];
                if(currsum>max){
                    max = currsum;
                }
            }
        }
        System.out.println("Maximum sum of subarrays is: "+max);

    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        maxsum(numbers);
    }
}
