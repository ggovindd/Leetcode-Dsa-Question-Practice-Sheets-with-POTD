class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        

            ArrayList<List<String >> ans = new ArrayList<>();
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            int i = 0;
            
            while(s1.length() > i ){
                if(s1.charAt(i) != s2.charAt(i)){
                    sb1.append(s1.charAt(i));
                    sb2.append(s2.charAt(i));
                    
                } 
                else{
                    if(sb1.length() > 0){
                    ans.add( Arrays.asList(sb1.toString(), sb2.toString()));
                sb1.setLength(0);
                sb2.setLength(0);
                }
                } 
                i++;
            }
             if(sb1.length() > 0){
                    ans.add( Arrays.asList(sb1.toString(), sb2.toString()));
             }

                return ans;
    }
}