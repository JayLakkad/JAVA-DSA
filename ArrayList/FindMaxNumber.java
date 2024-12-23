package ArrayList;
import java.util.*;


public class FindMaxNumber {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);
        for(int i=0;i<list.size();i++)
        {
            max = Math.max(max,list.get(i));
        }
        System.out.println("Max element: " + max);

    }
}
