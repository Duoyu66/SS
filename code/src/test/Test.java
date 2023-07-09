package test;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        int[] nums = new int[]{1, 2, 3, 1};
        System.out.println(test.rob(nums));
    }

    public int rob(int[] nums) {

        int[] dp = new int[nums.length];
        if(nums.length==1){

            return nums[0];
        } else if (nums.length==2) {
           return Math.max(nums[0],nums[1]);
        }else{
            dp[0]=nums[0];
            dp[1]=Math.max(nums[0],nums[1]);
            for (int i = 2; i <nums.length ; i++) {

            }

        }
        return 1;
    }
}
