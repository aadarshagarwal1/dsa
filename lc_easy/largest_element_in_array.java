public class largest_element_in_array {
    public static void main(String[] args) {
        System.out.println(largest(new int[] { 1, 2, 5, 3, 2, 4 }));
    }

    public static int largest(int[] arr) {
        if (arr == null || arr.length == 0)
            return -1;
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
