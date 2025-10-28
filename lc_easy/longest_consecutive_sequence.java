import java.util.HashSet;

public class longest_consecutive_sequence {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[] { 100, 4, 200, 1, 3, 2 }));
    }

    public static int longestConsecutive(int[] arr) {
        int length = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (Integer i : set) {
            if (!set.contains(i - 1)) {
                int curr_lenght = 1;
                while (set.contains(i + 1)) {
                    curr_lenght++;
                    i++;
                }
                length = Math.max(curr_lenght, length);
            }
        }
        return length;
    }
}
