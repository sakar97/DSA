//IN: [7,1,5,3,6,4]
//OUT: 5
//Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Not 7-1 = 6, as selling price needs to be larger than buying price.
class buy_sell {
    public static void main(String args[]) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        int n = arr.length;
        int profit = buySell(arr, n);
        System.out.println(profit);
    }

    private static int buySell(int[] arr, int n) {
        int maxProfit = 0;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            } else if (arr[i] - minValue > maxProfit) {
                maxProfit = arr[i] - minValue;
            }
        }
        return maxProfit;
    }
}