
public class reverseArray{
    public static void reverse(int arr[])
    {
        int first =0;
        int last =arr.length-1;
        while(first<last)
        {
            int temp = arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
        }
    }
    public static void main(String[] args) {
        int [] numbers = {2,4,6,8,10};
        reverse(numbers);
        for(int i =0 ; i<numbers.length;i++)
        {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
    
}