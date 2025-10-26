import java.util.Arrays;

public class rotate_array {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotate(new int[] { 1, 2, 3, 4, 5, 6 }, 2)));
    }

    public static int[] rotate(int[] arr, int k) {
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        return arr;
    }

    public static void reverse(int[] arr, int left, int right) {
        for (int i = 0; i < (right - left + 1) / 2; i++) {
            int temp = arr[left + i];
            arr[left + i] = arr[right - i];
            arr[right - i] = temp;
        }
    }
}
