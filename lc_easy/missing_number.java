import java.util.HashMap;

public class missing_number {
    public static void main(String[] args) {
        System.out.println(optimised_func(new int[] { 0, 1 }));
    }

    // O(n) space complexity and O(n) time complexity
    public static int func(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length + 1; i++) {
            if (!map.containsKey(i))
                return i;
        }
        return -1;
    }

    // O(1) space complexity (no new data structure is needed)
    public static int optimised_func(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return (nums.length * (nums.length + 1) / 2) - sum;
    }
}
