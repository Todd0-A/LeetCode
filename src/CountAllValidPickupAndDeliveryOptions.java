public class CountAllValidPickupAndDeliveryOptions {
    /*
    https://leetcode.com/problems/count-all-valid-pickup-and-delivery-options/
     */
    public int countOrders(int n) {
        long ans = 1;
        int MOD = 1_000_000_007;
        for (int i = 1; i <= n; ++i) {
            ans = ans * i;
            ans = ans * (2 * i - 1);
            ans %= MOD;
        }

        return (int)ans;
    }
}
