public class Main {

    public static void main(String[] args) {
        int[] stockPrices = new int[] {1, 5, 3, 2};

        System.out.println("Max Profit: " + getMaxProfit(stockPrices));
    }

    public static int getMaxProfit(int[] sp){
        int lowIndex = 0; // lowest stock price
        int maxProfit = sp[1] - sp[0]; // maxProfit initiated to first buy/sell

        for(int i = 1; i < sp.length; i++){
            if(sp[i] < sp[lowIndex]){
                lowIndex = i;
            } else {
                int tmpProfit = sp[i] - sp[lowIndex];
                if(tmpProfit > maxProfit){
                    maxProfit = tmpProfit;
                }
            }
        }
        return maxProfit;
    }
}