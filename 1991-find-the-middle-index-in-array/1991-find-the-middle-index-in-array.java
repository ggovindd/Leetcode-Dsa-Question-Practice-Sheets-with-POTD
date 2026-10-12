class Solution {
    public int findMiddleIndex(int[] nums) {
        int totalsum=0;
        for(int i:nums){
            totalsum+=i;
        } int left=0;
        int right=0;
        for(int i=0;i<nums.length;i++){
            right=totalsum-left-nums[i];
            if(right==left){
                return i; 
            }
            left+=nums[i];
         } return -1;
    }
}