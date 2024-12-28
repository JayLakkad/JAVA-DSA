package Stack;
import java.util.*;
public class StockSpan {
    public static void stockspan(int stocks[],int span[])
    {
        Stack<Integer>s = new Stack<>();
        s.push(0);
        for(int i =1;i<stocks.length;i++)
        {
            int currprice = stocks[i];
            while(currprice>stocks[s.peek()] && !s.isEmpty() )
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                span[i]=i+1;
            }
            else{
                int prevhigh = s.peek();
                span[i]=i-prevhigh;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int [] stocks = {100,80,60,70,60,85,100};
        int span[] = new int[stocks.length];
        stockspan(stocks,span);
        for(int i =0;i<span.length;i++)
        {
            System.out.print(span[i]+" ");
        }
    }
}
