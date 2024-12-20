import java.util.*;
public class Inbuiltsort{
    public static void main(String[] args) {
        // int[] arr = {5,4,1,3,2};
        // Arrays.sort(arr);
        // Arrays.sort(arr,0,3);
        Integer[] arr = {5,4,1,3,2};//reverse order method only works for objects so int which is primitive
        // will wont work for reverse order so we have to use Integer.
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}