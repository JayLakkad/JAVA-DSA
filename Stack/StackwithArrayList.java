package Stack;
import java.util.*;
public class StackwithArrayList {
    public static class stack{
        static ArrayList<Integer>list = new ArrayList<>();
        public boolean isEmpty(){
                    return list.size()==0;
                }
                public void push(int data){
                    list.add(data);
                }
                public  int pop(){
                    if(isEmpty()){
                        return -1;
                    }
                    int top = list.get(list.size()-1);
                    list.remove(list.size()-1);
                    return top;
                }
                public  int peak(){
                    if(isEmpty())
                    {
                        return -1;
                    }
                    return list.get(list.size()-1);
                }
            }
            public static void main(String[] args) {
                stack s = new stack();
                System.out.println(s.isEmpty());
                s.push(1);
                s.push(2);
                s.push(3);
                s.push(4);
                s.push(5);
                System.out.println(s.peak());
                System.out.println(s.pop());
                System.out.println(s.pop());
                System.out.println(s.peak());

    }
}
