import java.util.Arrays;

public class remove_element {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[] { 3, 2, 2, 3 }, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0, j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
                count++;
            }
        }
        return count;
    }
}
