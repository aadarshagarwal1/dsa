import java.util.Arrays;

public class rearrange_elements_by_sign {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrangeArray(new int[] { 3, 1, -2, -5, 2, -4 })));
    }

    public static int[] rearrangeArray(int[] nums) {
        int[] ret_arr = new int[nums.length];
        int pp = 0, np = 1;
        for (int i = 0; i < ret_arr.length; i++) {
            if (nums[i] < 0) {
                ret_arr[np] = nums[i];
                np += 2;
            } else {
                ret_arr[pp] = nums[i];
                pp += 2;
            }
        }
        return ret_arr;
    }
}
