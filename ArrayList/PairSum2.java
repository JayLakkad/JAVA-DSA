package ArrayList;

import java.util.ArrayList;

public class PairSum2 {//Time Complexity : O(n)
    public static boolean pairsumtwo(ArrayList<Integer>list,int target)
    {
        int n=list.size();
        int pivot=-1;
        for(int i=1;i<n;i++)
        {
            if(list.get(i)<list.get(i-1))
            {
                pivot = i;
                break;
            }
        }
        int i = pivot;
        int j =pivot-1;
        while(i!=j)
        {
            if(list.get(i)+list.get(j)==target)
            {
                return true;
            }
            else if(list.get(i)+list.get(j)<target)
            {
                i = (i+1)%n;

            }
            else{
                j=(n+j-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        //sorted and rotated list
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 100;
        System.out.println(pairsumtwo(list,target));
    }
}
