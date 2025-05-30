package Queues;
import java.util.*;
public class FirstNonRepeatingLetter {
    public static char firstnonrepeating(String str)
    {
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;
            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1)
            {
                q.remove();
            }
        }
        if(q.isEmpty())
        {
            return '#';
        }
        return q.peek();
    }
   
    public static void main(String[] args) {
        String s = "aabccxb";
        System.out.println(firstnonrepeating(s));
    }
}
