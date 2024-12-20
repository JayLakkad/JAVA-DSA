public class searchRotatedSortedArray {
    public static int search(int []arr,int target)
    {
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println("The index of the target element is "+search(nums,target));
    }
}
