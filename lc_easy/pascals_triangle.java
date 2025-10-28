import java.util.ArrayList;
import java.util.List;

public class pascals_triangle {
    public static void main(String[] args) {
        System.out.println(generate(6));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    arr.add(1);
                } else {
                    arr.add(list.get(i - 1).get(j) + list.get(i - 1).get(j - 1));
                }
            }
            list.add(arr);
        }
        return list;
    }

}
