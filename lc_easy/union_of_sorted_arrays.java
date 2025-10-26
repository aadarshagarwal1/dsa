import java.util.Arrays;

public class union_of_sorted_arrays {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(union(new int[] { 2, 2, 3, 4, 5, 6 }, new int[] { 1, 1, 2, 3, 4, 5, 5, 6, 7 })));
    }

    public static int[] union(int[] a, int[] b) {
        int[] union = new int[a.length + b.length];
        int i = 0;
        int ap = 0, bp = 0;
        while (ap < a.length && bp < b.length) {
            if (a[ap] < b[bp]) {
                if (i > 0 && a[ap] == union[i - 1]) {
                    ap++;
                } else
                    union[i++] = a[ap++];
            } else {
                if (i > 0 && b[bp] == union[i - 1]) {
                    bp++;
                } else
                    union[i++] = b[bp++];
            }
        }
        while (ap < a.length) {
            if (i > 0 && a[ap] == union[i - 1]) {
                ap++;
            } else
                union[i++] = a[ap++];
        }
        while (bp < b.length) {
            if (i > 0 && b[bp] == union[i - 1]) {
                bp++;
            } else
                union[i++] = b[bp++];
        }
        return Arrays.copyOf(union, i);
    }
}
