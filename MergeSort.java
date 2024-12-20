public class MergeSort{
    public static void main(String[] args) {
        int []arr = {6,3,9,5,2,8,-2};
        mergesort(arr,0,arr.length-1);
        printArr(arr);
    }
    public static void mergesort(int [] arr,int l , int r)
    {
        if(l>=r)
        {
            return;
        }
        int mid = l+(r-l)/2;
        mergesort(arr, l, mid);//left part
        mergesort(arr, mid+1, r);
        merge(arr,l,mid,r);
    }
    public static void merge(int []arr, int l,int mid,int r)
    {
        int temp[] =new int[r-l+1];
        int i =l;
        int j=mid+1;
        int k =0;
        while(i<=mid && j<=r)
        {
            if(arr[i]<=arr[j])
            {
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid)
        {
            temp[k++]=arr[i++]; 
        };
        while(j<=r)
        {
            temp[k++]=arr[j++];
        }
        for(k=0,i=l;k<temp.length;i++,k++)
        {
            arr[i]=temp[k];
        }
    }
    public static void printArr(int []arr)
    {
        for(int i =0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}