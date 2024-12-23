package ArrayList;
import java.util.*;
public class ContainerWithMostWater {
    // public static int storeWater(ArrayList<Integer>height){//BRute force approach : O(n^2)
    //     int max = 0 ;
    //     for(int i =0;i<height.size();i++){
    //         for(int j =i+1;j<height.size();j++){
    //             int h = Math.min(height.get(i),height.get(j));
    //             int w = j-1;
    //             int area = h*w;
    //             if(area>max){
    //                 max = area;
    //             }

    //         }
    //     }
    //     return max;
    // }
    // Two pointer Approach
    public static int storeWater(ArrayList<Integer>height){//Optimized approach : O(n)
       int i=0;
       int j = height.size()-1;
       int max = 0;
       while(i<j)
       {
        int h = Math.min(height.get(i),height.get(j));
        int w = j-i;
        int area = h*w;
        max = Math.max(max,area);
        if(height.get(i)>height.get(j))
        {
            j--;
        }
        else{
            i++;
        }
       }
       return max;

    }
    public static void main(String[] args) {
         ArrayList<Integer>height = new ArrayList<>();
            height.add(1);
            height.add(8);
            height.add(6);
            height.add(2);
            height.add(5);
            height.add(4);
            height.add(8);
            height.add(3);
            height.add(7);
            System.out.println(storeWater(height));

    }
}
