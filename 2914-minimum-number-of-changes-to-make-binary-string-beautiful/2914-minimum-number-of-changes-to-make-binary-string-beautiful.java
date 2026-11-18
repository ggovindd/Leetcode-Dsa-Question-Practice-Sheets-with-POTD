class Solution {
    public int minChanges(String s) {
        
        int changes = 0;
        for(int i = 0; i<s.length(); i++){

        if(s.charAt(i) != s.charAt(i+1)){
            changes++;
        } 
        i++;
            
        } return changes;

    }
}