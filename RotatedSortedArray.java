public class RotatedSortedArray {
    //will use modified binary search
    public static void main(String[] args) {
        int []arr={4,5,6,7,0,1,2};
        int target = 6;
        int targetIndex = rotatedSearch(arr,target,0,arr.length-1);
        System.out.println(targetIndex);
    }
    public static int rotatedSearch(int []arr,int target,int si,int ei)
    {
        // base
        if(si>ei)
        {
            return -1;
        }
        //kaam
        int mid = si+(ei-si)/2;

        //case
        if(arr[mid]==target){
            return mid;
        }
        //L1
        if(arr[si]<=arr[mid])
        {
            //case a:
            if(arr[si]<=target && target<=arr[mid])
            {
                return rotatedSearch(arr, target, si, mid-1);
            }
            //case b:
            else{
                return rotatedSearch(arr, target, mid+1, ei);
            }
        }
        //L2
        else{
            // case c:
            if(arr[mid]<=target && target<=arr[ei])
            {
                return rotatedSearch(arr, target, mid+1, ei);
            }
            // case d:
            else{
                return rotatedSearch(arr, target, si, mid-1);
            }
        }

    }
}
