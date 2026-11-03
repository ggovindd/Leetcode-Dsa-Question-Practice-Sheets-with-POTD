class Solution {
    public int minMoves(int[] nums) {
        // int max=0;
        // for(int i = 0; i< nums.length; i++){
        //     max = Math.max(nums[i], max);
        // } 

        // int moves = 0;
        //  for(int i = 0; i< nums.length; i++){
        //     moves += max - nums[i];
        //  } 
        //  return moves;

        //  Logic for finding minimum moves firt we calculate max ele  and also calculate the sum of all the idices 

        //  int max = Integer.MIN_VALUE;
        // int sum = 0;
        // for(int i = 0;i < nums.length; i++){
        //     sum += nums[i];
        //     if(nums[i] > max){
        //         max = nums[i];
        //     }
        // }
        // return max*nums.length-sum;
int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int num : nums){
            max = Math.max(max, num);
            sum += num;
        }

        return nums.length * max - sum;
    }
}