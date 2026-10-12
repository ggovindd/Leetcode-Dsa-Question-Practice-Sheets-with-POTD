class NumArray {
int []prfix;
    public NumArray(int[] nums) {
        prfix=new int[nums.length];
        prfix[0] =nums[0];
        for(int i=1;i<nums.length;i++){
           prfix[i]=nums[i]+prfix[i-1];
        }

    }
    
    public int sumRange(int left, int right) {
        if(left==0){
            return prfix[right];
        } else{
            return  prfix[right] - prfix[left-1];
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */