class Solution {
    public double findMaxAverage(int[] nums, int k) {
// if fixed size negative and possitve no.. does'nt matter 
        int max=Integer.MIN_VALUE;
    int i=0; int j=0;
        int sum=0;
        while(i<nums.length){
             sum+=nums[i];
            if(i-j+1==k){
               max = Math.max(max,sum);
                sum-=nums[j];
                j++;
            }  
        
            i++;
        }
            return (double)max/k;
    }
}