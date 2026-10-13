class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        int i=0;
        long ans=0;
        int j=nums.length-1;
        while(i<=j){
            if(i!=j){
                ans+=(long)nums[j]-(long)nums[i];
            } else{
                ans+=(long)nums[j];
            } i++;
            j--;
        } return ans;
    }
}