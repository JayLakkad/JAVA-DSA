package Stack;
import java.util.*;
public class NextGreaterElement {
    public static void nextgreater(Stack<Integer>s,int []next,int[]arr,int index){
        while(!s.isEmpty() && arr[index]>=s.peek() )
        {
            s.pop();
        }
        if(s.isEmpty())
        {
            next[index]=-1;
        }
        else{
            next[index]=s.peek();
        }
        s.push(arr[index]);

    }
    public static void main(String[] args) {
        int [] arr = {6,8,1,1,3};
        Stack<Integer>s = new Stack<>();
        int [] next = new int[arr.length];
        for(int i =arr.length-1;i>=0;i--)
        {
            nextgreater(s,next,arr,i);
        }
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(next[i]+" ");
        }
    }
}
