package Stack;
import java.util.*;
public class ReverseString {
    public static String reverseString(String str)
    {
        Stack<Character>s = new Stack<>();
        int index = 0;
        while(index < str.length())
        {
            s.push(str.charAt(index));
            index++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();

    }
    public static void main(String[] args) {
        String str = "i am jay";
        System.out.println(reverseString(str));

    }
}
