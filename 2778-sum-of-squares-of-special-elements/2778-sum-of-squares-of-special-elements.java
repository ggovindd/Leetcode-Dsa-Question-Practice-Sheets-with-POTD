class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int digit=nums[i];
            int j=i+1;
            if(n%j==0){
                ans+=digit*digit;
            }
        } return ans;
    }
}