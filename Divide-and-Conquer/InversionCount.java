class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
       return mergesort(arr,0,arr.length-1);
    }
    public static int mergesort(int [] arr, int si,int ei){
        int count= 0 ;
        if(ei>si)
        {
            int mid= si + (ei - si)/2;
            count += mergesort(arr,si,mid);
            count += mergesort(arr,mid+1,ei);
            count +=merge(arr,si,mid+1,ei);
        }
        return count;
    }
    public static int merge(int [] arr,int si,int mid,int ei){
        int i=si;
        int j =mid;
        int k =0;
        int count = 0;
        int[]temp = new int[(ei-si+1)];
        while((i <mid) && (j<=ei))
        {
            if(arr[i]<=arr[j])
            {
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                count+=(mid-i);
                j++;
                
            }
            k++;
        }
        while(i<mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=ei)
        {
            temp[k]=arr[j];
            j++;
            k++;
        }
        for( i=si,k=0;i<=ei;i++,k++)
        {
            arr[i]=temp[k   ];
        }
        return count;
    }
}