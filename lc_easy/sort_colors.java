import java.util.Arrays;

public class sort_colors {
    public static void main(String[] args) {
        int[] arr = new int[] { 0, 1, 1, 2, 0, 1, 2, 1 };
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortColors(int[] nums) {
        int cz = 0, co = 0, ct = 0;
        for (int i = 0; i < nums.length; i++) {
            switch (nums[i]) {
                case 0:
                    cz++;
                    break;
                case 1:
                    co++;
                    break;
                case 2:
                    ct++;
                    break;

                default:
                    break;
            }
        }
        for (int i = 0; i < cz; i++) {
            nums[i] = 0;
        }
        for (int i = 0; i < co; i++) {
            nums[cz + i] = 1;
        }
        for (int i = 0; i < ct; i++) {
            nums[cz + co + i] = 2;
        }
    }

    public static void sortColors_optimised(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1, temp;
        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    temp = nums[mid];
                    nums[mid] = nums[low];
                    nums[low] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = nums[high];
                    nums[high] = nums[mid];
                    nums[mid] = temp;
                    high--;
                    break;
                default:
                    break;
            }
        }
    }
}
