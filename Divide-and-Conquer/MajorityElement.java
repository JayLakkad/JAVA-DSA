class MajorityElement {
    public int majorityElement(int[] nums) {
        return majorityelement(nums,0,nums.length-1);
    }
    public static int count(int []arr,int tar,int si,int ei)
    {
        int count = 0;
        for(int i =si;i<=ei;i++)
        {
            if(arr[i]==tar)
            {
                count++;
            }
        }
        return count;
    }
    public static int majorityelement(int []arr,int si,int ei)
    {
        if(si==ei)
        {
            return arr[si];
        }
        int mid = si + (ei - si)/2;
        int left = majorityelement(arr,si,mid);
        int right = majorityelement(arr,mid+1,ei);

        if(left == right)
        {
            return left;
        }
        else{
            int leftcount = count(arr,left,si,mid);
            int rightcount = count(arr,right,mid+1,ei);
            int result = leftcount>rightcount?left:right;
            return result;
        }
    }
} 