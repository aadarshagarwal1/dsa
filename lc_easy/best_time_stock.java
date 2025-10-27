public class best_time_stock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] { 7 }));
    }

    public static int maxProfit(int[] arr) {
        int profit = 0, min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            profit = Math.max(profit, arr[i] - min);
            min = Math.min(min, arr[i]);
        }
        return profit;
    }
}
