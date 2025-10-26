public class max_consecutive_ones {
    public static void main(String[] args) {
        System.out.println(mco(new int[] { 1, 2, 0, 1, 1, 1, 0, 1, 1 }));
    }

    public static int mco(int[] nums) {
        int count = 0;
        int curr_count = 0;
        for (int i = 0; i < nums.length; i++) {
            while (i < nums.length && nums[i] == 1) {
                curr_count++;
                i++;
            }
            if (curr_count > count) {
                count = curr_count;
            }
            curr_count = 0;
        }
        return count;
    }
}
