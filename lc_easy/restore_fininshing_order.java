import java.util.Arrays;
import java.util.HashSet;

public class restore_fininshing_order {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(recoverOrder(new int[] { 3, 1, 2, 5, 4 }, new int[] { 1, 3, 4 })));
    }

    public static int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> friendsMap = new HashSet<>();
        for (int i = 0; i < friends.length; i++) {
            friendsMap.add(friends[i]);
        }
        int[] ret_arr = new int[friends.length];
        int a = 0;
        for (int j = 0; j < order.length; j++) {
            if (friendsMap.contains(order[j])) {
                ret_arr[a++] = order[j];
            }
        }
        return ret_arr;
    }
}
