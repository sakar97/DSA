package Greedy;

public class n_coins {
    public static void main(String[] args) {
        int[] coins = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };
        int V = 100;
        int ans = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            if (V >= coins[i]) {
                while (V >= coins[i]) {
                    V = V - coins[i];
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

}
