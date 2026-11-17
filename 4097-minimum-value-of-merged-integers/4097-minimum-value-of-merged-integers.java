class Solution {
    public int minMergedInteger(int[] nums) {
        int miniAns = Integer.MAX_VALUE;
        int mergeVal = 0;
        for(int i = 0; i< nums.length; i++){
            
          int count =  countDigit(nums[i+1]);
            int digit = 1;
            for(int j = 0;j < count; j++){
                digit*=10;
            }
            mergeVal = nums[i] * digit +nums[i+1];
            miniAns = Math.min(miniAns, mergeVal);
            i++;

        } 
        return miniAns;
    }
        private int countDigit(int num){
            int count = 0;
            while(num > 0){
                count++;
                num/=10;
            } 
            return count;
        }
    }
