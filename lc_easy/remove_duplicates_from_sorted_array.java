public class remove_duplicates_from_sorted_array {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] { 1, 1, 1, 2, 3, 3, 4, 5 }));
    }

    public static int removeDuplicates(int[] arr) {
        int count = 1;
        int curr_num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != curr_num) {
                curr_num = arr[i];
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }
}
