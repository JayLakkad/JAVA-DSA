package Greedy;
import java.util.*;
public class IndianCoins {
   public static void main(String[] args) {
    Integer coins[] = {1,2,5,10,20,50,100,200,500,2000};
    Arrays.sort(coins,Comparator.reverseOrder());
    int count =0;
    int amount = 590;
    ArrayList<Integer>res = new ArrayList<>();
    for(int i =0;i<coins.length;i++)
    {
        if(coins[i]<=amount)
        {
            count++;
            res.add(coins[i]);
            amount -= coins[i];
        }
    }
    System.out.println("Total minimum coins used: "+count);
    for(int i =0;i<res.size();i++)
    {
        System.out.print(res.get(i)+" ");
    }
    System.out.println();
   }
}
