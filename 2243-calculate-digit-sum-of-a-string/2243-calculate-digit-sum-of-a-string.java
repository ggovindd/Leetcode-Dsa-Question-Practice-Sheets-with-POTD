class Solution {
    public String digitSum(String s, int k) {
        
         if(s.length() <= k){
          return   s;
        }

         StringBuilder res = new StringBuilder();
        int i = 0;
        while(i < s.length()){

            StringBuilder sb = new StringBuilder();
            int j = 0;
            int sum = 0;
            while(j < k && i < s.length()){
                sum += s.charAt(i) - '0';
                i++;
                j++;            
            } 
            res.append(sum);

        } 
        s = res.toString();
        if(s.length() > k){
          return   digitSum(s, k);
        }
return s;

    }
}