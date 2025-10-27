public class majority_element {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
    }

    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }
            if (candidate == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}
