public class longest_subarray_sumK {
    public static void main(String[] args) {
        System.out.println(longestSubarray(new int[] { 10, 5, 2, 7, 1, -10 }, 15));
    }

    public static int longestSubarray(int[] arr, int sum) {
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            int s = 0;
            for (int j = i; j < arr.length; j++) {
                s += arr[j];
                if (s == sum) {
                    length = Math.max(length, j - i + 1);
                }
            }

        }
        return length;
    }
}
