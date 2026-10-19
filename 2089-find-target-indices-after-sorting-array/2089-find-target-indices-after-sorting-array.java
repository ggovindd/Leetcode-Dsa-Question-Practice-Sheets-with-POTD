class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        // Arrays.sort(nums);
        List<Integer> ans=new ArrayList<>();
        // for(int i = 0; i<nums.length; i++){
        //     if(nums[i]== target){
        //         ans.add(i);
        //     } 
        //     if(nums[i]>target){
        //         break;
        //     }
        // } return ans;
        int n=nums.length;
        int lessThenTarget=0;
        int equalToTarget=0;
        for(int i:nums){
            if(i==target){
                equalToTarget++;
            } if(i<target){
                lessThenTarget++;
            }
            
        } 
        int till=lessThenTarget+equalToTarget;
        for(int i = lessThenTarget; i< till ;i++){
            ans.add(i);
        } 
        return ans;
    }
}