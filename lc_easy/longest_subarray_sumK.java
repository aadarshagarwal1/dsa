import java.util.HashMap;

public class longest_subarray_sumK {
    public static void main(String[] args) {
        System.out.println(longestSubarraySW(new int[] { 2, 3, 5, 1, 9 }, 10));
    }

    // brute force approach
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

    // optimal appraoch for negative and positive numbers and better appraoch for
    // only positive numbers
    public static int longestSubarrayHashmap(int[] arr, int sum) {
        int s = 0, l = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
            if (s == sum) {
                l = i + 1;
            }
            if (!map.containsKey(s)) {
                map.put(s, i);
            }
            if (map.containsKey(s - sum)) {
                l = Math.max(l, i - map.get(s - sum));
            }
        }
        return l;
    }

    // sliding window approach - most optimal for only positive numbers
    public static int longestSubarraySW(int[] arr, int sum) {
        int s = 0, l = 0;
        int i = 0;
        for (int k = 0; k < arr.length; k++) {
            if (s + arr[k] <= sum) {
                s += arr[k];
                if (s == sum) {
                    l = Math.max(l, k - i + 1);
                }
            }

            else {
                s -= arr[i];
                i++;
                k--;
            }
        }
        return l;
    }
}
