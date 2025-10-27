import java.util.ArrayList;

public class array_leaders {
    public static void main(String[] args) {
        System.out.println(leaders(new int[] { 16, 17, 4, 3, 5, 2 }));
    }

    public static ArrayList<Integer> leaders(int[] arr) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int max = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (max <= arr[i]) {
                leaders.add(0, arr[i]);
            }
            max = Math.max(max, arr[i]);
        }
        return leaders;
    }
}
