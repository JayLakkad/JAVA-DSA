public class BestTimetoBuyandSellStocks {
    public static int maxProfit(int [] prices)
    {
        int n = prices.length;
        int minbuyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i =1;i<n;i++)
        {
            if(prices[i]<minbuyprice)
            {
                minbuyprice = prices[i];
            }
            else{
                if(prices[i]-minbuyprice>maxprofit){
                    maxprofit = prices[i]-minbuyprice;
                }
            }
         }
         return maxprofit;
    }
    
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println("The maximum profit is "+maxProfit(prices));
    }
}
