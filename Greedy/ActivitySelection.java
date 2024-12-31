package Greedy;
import java.util.*;
public class ActivitySelection {
    public static void main(String[] args) {
        int [] start = {1,3,0,5,8,5};
        int [] end = {2,4,6,7,9,9};  
        //sorting-if end is not provided in sorted manner

        // int activity[][] = new int[start.length][3];
        // for(int i=0;i<start.length;i++)
        // {
        //    activity[i][0]=i;
        //    activity[i][1]=start[i];
        //    activity[i][2]=end[i];
        // }
        //lemda function -> shortform of any function is called lemda function
        // Arrays.sort(activity,Comparator.comparingDouble(o -> o[2]));

        //end time basis sorted
        int maxAct = 0;
        ArrayList<Integer>ans = new ArrayList<>();
        maxAct =1;
        ans.add(0);
        int lastend = end[0];
        for(int i=1;i<end.length;i++)
        {
            if(start[i]>=lastend)
            {
                maxAct++;
                ans.add(i);
                lastend = end[i];
            }
        }
        System.out.println("Max activities: "+maxAct);
        for(int i =0 ;i < ans.size();i++)
        {
            System.out.print("A"+ ans.get(i)+" ");
        }
        System.out.println();
    }
}
