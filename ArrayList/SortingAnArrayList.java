package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingAnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);  
        System.out.println(list);
        Collections.sort(list);//ascending Order
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());//descending Order
        System.out.println(list);
    }
}
