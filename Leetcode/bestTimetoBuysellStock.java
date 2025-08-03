class bestTimetoBuysellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            else{
                int profit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
 
    }
    public static void main(String[] args) {
        bestTimetoBuysellStock solver = new bestTimetoBuysellStock();
        int[] prices = {3,5,1,6,7,8,9,0};
        int result = solver.maxProfit(prices);
        System.out.println("Maximum Profit: " + result);
    }
}
