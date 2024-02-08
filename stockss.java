public class stockss {
    public static int buyAndSellStocks(int prices[]){
        int maxprofit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i=0; i<prices.length;i++){
            if(buyPrice<prices[i]){ //profit 
                int profit = prices[i]-buyPrice; //profit of today's
                maxprofit = Math.max(maxprofit,profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(buyAndSellStocks(prices));
        
    }
    
}
