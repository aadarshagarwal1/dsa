import java.util.Arrays;

public class next_permutation {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 2, 1 };
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void nextPermutation(int[] arr) {
        outerloop: for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                int left = 0, right = arr.length - 1;
                while (left <= right) {
                    int temp = arr[left];
                    arr[left++] = arr[right];
                    arr[right--] = temp;
                }
                return;
            }
            for (int j = i; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    break outerloop;
                }
            }
        }
    }
}
