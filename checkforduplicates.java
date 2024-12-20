//Arrays Assignment :
//1.Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

public class checkforduplicates {
    public static boolean findduplicates(int [] arr)
    {
        int n = arr.length;
        for(int i =0;i<n;i++)
        {
            for(int j =i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,3,4,2};
        System.out.println("There are any duplicates? Ans: "+findduplicates(nums));
    }
}
