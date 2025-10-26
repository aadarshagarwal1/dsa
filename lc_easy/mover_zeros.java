import java.util.Arrays;

public class mover_zeros {
    public static void main(String[] args) {
        int[] arr = new int[] { 0, 1, 2, 0, 4, 0, 2 };
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    // brute-force
    /*
     * public static void moveZeros(int[] arr) {
     * int[] temp = new int[arr.length];
     * int countZeros = 0;
     * int countNums = 0;
     * for (int i = 0; i < arr.length; i++) {
     * if (arr[i] == 0) {
     * countZeros++;
     * } else {
     * temp[countNums] = arr[i];
     * countNums++;
     * }
     * }
     * for (int i = 0; i < countZeros; i++) {
     * temp[countNums + i] = 0;
     * }
     * for (int i = 0; i < temp.length; i++) {
     * arr[i] = temp[i];
     * }
     * }
     */
    // better approach
    /*
     * public static void moveZeros(int[] arr) {
     * int j = 0;
     * for (int i = 0; i < arr.length; i++) {
     * if (arr[i] != 0) {
     * arr[j] = arr[i];
     * j++;
     * }
     * }
     * for (int i = j; i < arr.length; i++) {
     * arr[i] = 0;
     * }
     * }
     */
    // best approach
    public static void moveZeros(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
