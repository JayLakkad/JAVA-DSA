package ArrayList;
import java.util.*;
public class SwapTwoNumbers {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        int n =1;
        int m =3;
        System.out.println(list);
        swap(list,n,m);
        System.out.println(list);
    }
    public static  void swap(ArrayList<Integer> list,int n ,int m)
    {
        int temp = list.get(n);
        list.set(n,list.get(m));
        list.set(m,temp);

    }
}
