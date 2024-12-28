package Stack;

import java.util.*;

public class DuplicateParanthesis {
    public static boolean checkduplicate(String str)//O(n)
    {
        Stack<Character>s = new Stack<>();
        int n = str.length();
        for(int i = 0 ;i<n;i++)
        {
            char ch =str.charAt(i);
            if(ch == ')'){
                int count = 0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1)
                {
                    return true;
                }
                else{
                    s.pop();
                }
            }
            else{
                s.push(ch);
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        String str = "((a+b))";
        String str2 = "(a-b)";
        System.out.println(checkduplicate(str));
        System.out.println(checkduplicate(str2));
    }
}
