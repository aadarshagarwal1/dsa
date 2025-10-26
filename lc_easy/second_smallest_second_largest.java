import java.util.Arrays;

public class second_smallest_second_largest {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(smsl(new int[] { 1, 3, 2, 4 })));
    }

    public static int[] smsl(int[] arr) {
        if (arr.length < 2)
            return new int[] { -1, -1 };
        int s, ss, l, sl;
        s = Integer.MAX_VALUE;
        ss = Integer.MAX_VALUE;
        sl = Integer.MIN_VALUE;
        l = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < s) {
                ss = s;
                s = arr[i];
            } else if (arr[i] < ss && arr[i] != s) {
                ss = arr[i];
            }
            if (arr[i] > l) {
                sl = l;
                l = arr[i];
            } else if (arr[i] > sl && arr[i] != l) {
                sl = arr[i];
            }
        }
        return new int[] { ss, sl };
    }
}
