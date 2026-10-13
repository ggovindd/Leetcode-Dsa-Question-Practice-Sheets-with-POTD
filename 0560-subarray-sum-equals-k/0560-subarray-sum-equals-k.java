class Solution {
    public int subarraySum(int[] nums, int k) {
       Map<Integer,Integer> map = new HashMap<>();
       int n=nums.length;
       map.put(0,1);
       int count=0;
       int prefix=0;
       for(int i=0;i<n;i++){
        prefix+=nums[i];
      
        if(map.containsKey(prefix-k)){
             count+=map.get(prefix-k);
           
        }
          map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
 return count;
    } 
}