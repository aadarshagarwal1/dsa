
class sorted_and_rotated_array {
    public static void main(String[] args) {
        System.out.println(check(new int[] { 5, 1, 2, 3, 4 }));
    }

    public static boolean check(int[] arr) {
        int bpc = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[(i + 1) % arr.length]) {
                bpc++;
            }
        }
        return (bpc <= 1);
    }
}