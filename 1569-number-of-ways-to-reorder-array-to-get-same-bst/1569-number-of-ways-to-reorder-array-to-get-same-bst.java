class Solution {
  private int[][] PT;
    int mod = 1000000007;
    public int numOfWays(int[] nums) {
            int n=nums.length;
          PT=new int[n+1][n+1];
          for (int i =0;i<= n;i++) {
            PT[i][0]=1;
            PT[i][i]=1;
        }
        for(int i=2;i<=n;i++){

            for(int j=1;j<i;j++){
             PT[i][j]= (int)(((long)PT[i - 1][j - 1] + PT[i - 1][j]) % mod);
            }
        }
           return (solve(nums)-1+mod) % mod;
    }  int solve(int [] nums){
              int n=nums.length;
                if(n<3) return 1;
        ArrayList<Integer> leftList = new ArrayList<>();
        ArrayList<Integer> rightList=new ArrayList<>();

        int root=nums[0];

        for(int i=1;i<n;i++){
            if(nums[i]<root){
                leftList.add(nums[i]);
            }
            else {
                rightList.add(nums[i]);
            }
        } 

        // calculating permutation how many required space are there
        int[] left=new int[leftList.size()];
            for(int i=0;i<leftList.size();i++){
                 left[i]=leftList.get(i);
            }
        int[] right=new int[rightList.size()];
            for(int i=0;i<rightList.size();i++){
                    right[i]=rightList.get(i);
                }
// calculating permutation how many required space are there
        long leftWays = solve(left) % mod;
        long rightWays = solve(right) % mod;
        return (int)((((leftWays * rightWays) % mod) * PT[n - 1][left.length]) % mod);
    

    }
}