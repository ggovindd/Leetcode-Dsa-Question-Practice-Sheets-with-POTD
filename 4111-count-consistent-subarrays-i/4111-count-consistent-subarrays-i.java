class Solution {
    public int countConsistent(int[] nums) {
         int count = 0;
        for( int i = 0;i< nums.length ;i++){
            
            int and = nums[i];

            int mini = nums[i];
            for(int j = i; j< nums.length; j++){
                mini = Math.min(nums[j], mini);
                and = nums[j] & and;
                if(mini == and ){
                    count++;
                }
            }
        } return count;
    }
}