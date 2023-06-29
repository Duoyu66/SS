package test;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        int[] nums = new int[]{4, 1, 2, 1, 2};
        System.out.println(test.singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        int value = 0;
        for (int i = 0; i < nums.length; i++) {
            value ^= nums[i];
        }
        return value;
    }
}
