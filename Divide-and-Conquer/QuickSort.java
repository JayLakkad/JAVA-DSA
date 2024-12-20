public class QuickSort {
    //Time Complexity : Average Case :O(nlogn)
    //                  Worst Case : O(n^2)
    //                  Best Case : O(1)
    //Space Complexity : O(logn)

    //will take the last element as pivot
    public static void main(String[] args) {
        int []arr = {6,3,9,5,-1,2,8};
        quicksort(arr,0,arr.length-1);
        printArr(arr);
    }
    public static void printArr(int [] arr)
    {
        for(int i =0 ;i <arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int []arr,int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
    public static int partition(int []arr,int si , int ei){
        int pivot = arr[ei];
        int  i = si-1;//to make place smaller than pivot
        for(int j=si;j<ei;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                swap(arr,i,j);
            }
        }
        i++;
        swap(arr,ei,i);
        return i ;
    }
    public static void quicksort(int []arr,int si ,int ei )
    {
        if(si>=ei){
            return ;
        }
        int pivot = partition(arr,si,ei);
        quicksort(arr, si, pivot-1);//left
        quicksort(arr, pivot+1, ei);//right
    }
}
