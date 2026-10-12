class Solution {
    public int pivotIndex(int[] nums) {
    //     int totalSum = 0;
    //      int rightsum=0;
    //     for(int num:nums){
    //         totalSum+=num;
    //     } 
    //     int leftsum=0;
    //     for(int i=0;i<nums.length;i++){
    //      rightsum=totalSum-leftsum-nums[i];
    //      if(leftsum==rightsum){
    //         return i;
    //      }
    // leftsum+=nums[i];
    //     }
    //      return -1;
    int leftsum=0;

   
    for(int i=0;i<nums.length;i++){
       
        int rightsum=0;
       
        for(int j=i+1;j<nums.length;j++){
            rightsum+=nums[j];
           
        }  if(rightsum==leftsum){
                return i;
            }  leftsum+=nums[i];
    } return -1;
    }
}