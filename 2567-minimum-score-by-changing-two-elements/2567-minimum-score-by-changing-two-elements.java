class Solution {
    public int minimizeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);


        int option1 = nums[n - 3] - nums[0];   
        int option2 = nums[n - 1] - nums[2];   
        int option3 = nums[n - 2] - nums[1];   

        return Math.min(option1, Math.min(option2, option3));
    }
}