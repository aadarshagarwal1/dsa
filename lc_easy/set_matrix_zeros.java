import java.util.ArrayList;
import java.util.Arrays;

public class set_matrix_zeros {
    public static void main(String[] args) {
        int[][] matrix = new int[][] { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void setZeroes(int[][] matrix) {
        ArrayList<Integer>[] zeros_pos = new ArrayList[2];
        zeros_pos[0] = new ArrayList<>();
        zeros_pos[1] = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    zeros_pos[0].add(i);
                    zeros_pos[1].add(j);
                }
            }
        }
        for (Integer i : zeros_pos[0]) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = 0;
            }
        }
        for (Integer i : zeros_pos[1]) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = 0;
            }
        }
    }
}
