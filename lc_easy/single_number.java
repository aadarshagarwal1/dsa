public class single_number {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] { 1, 1, 2, 2, 1, 1, 2 }));
    }

    public static int singleNumber(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            num ^= nums[i];
        }
        return num;

    }
}
