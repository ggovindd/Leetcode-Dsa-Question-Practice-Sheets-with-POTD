class Solution {
    public int minSubArrayLen(int target, int[] nums) {

            int min = 10000000;
            int i = 0;
            int j = 0;
            int sum = 0;

            while(i < nums.length){

                sum += nums[i];
                while(target <= sum){
                    min = Math.min(min, i-j+1);
                    sum -= nums[j];
                    j++;
                } 
                i++;

            }  

            if(min == 10000000){
                return 0;
            }
            
 return min;
    }
}