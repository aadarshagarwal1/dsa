import java.util.Arrays;
import java.util.HashMap;

public class two_sum_optimised {
    public static void main(String[] args) {
        int[] res = twoSum(new int[] { 1, 2, 3, 4, 5 }, 6);
        System.out.println(Arrays.toString(res));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] { map.get(target - nums[i]), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
// create a hashmap of the numbers and their positions
// start checking or all the numbers in the list
// if the complement for the number exists in the hashmap then work is done
// if not then insert the number in the hashmap for it be used as some other
// number's complement
