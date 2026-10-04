class Solution {
    public boolean checkValidString(String s) {
        int countPara=0;
        int countAsti=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                countPara++;
                countAsti++;
            } else if(s.charAt(i)==')'){
                countPara--;
                countAsti--;
            } else{
                countAsti++;
                countPara--;
            } 
            if(countAsti < 0) {
                return false;
            }
            if(countPara <0) {
                countPara=0;
            }
        }
        return countPara == 0;
        
    }
}