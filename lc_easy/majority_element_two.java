import java.util.ArrayList;

public class majority_element_two {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] { 2, 1, 3, 1, 2, 3, 1, 1, 1 }));
    }

    public static ArrayList<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int a = nums[0], count = 0, b;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == a) {
                count++;
            } else if (count == 0) {
                a = nums[i];
                count = 1;
            } else {
                count -= 0.5;
            }
        }
        if (count > 0) {
            list.add(a);
        }
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != a) {
                b = nums[i];
                count = 0;
                break;
            }
            i++;
        }
        for (; i < nums.length; i++) {
            if (nums[i] == b) {
                count++;
            } else if (count == 0 && nums[i] != a) {
                b = nums[i];
                count = 1;
            } else if (nums[i] != a) {
                count--;
            }
        }
        if (count > 0) {
            list.add(b);
        }
        return list;
    }
}
