public class t121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int result = 0;
        int buy = prices[0];
        for(int price : prices){
            if(price > buy)
                result = Math.max(result, price - buy);
            else
                buy = price;
        }
        return result;
    }
}
