package ArrayList;
import java.util.*;
public class MultiDiamensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainlist = new ArrayList<>();
        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        mainlist.add(list1);
        ArrayList<Integer>list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainlist.add(list2);
        System.out.println(mainlist);
    }    
}
