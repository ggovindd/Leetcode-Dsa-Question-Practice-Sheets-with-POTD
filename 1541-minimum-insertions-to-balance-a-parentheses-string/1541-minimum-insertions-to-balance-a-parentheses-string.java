class Solution {
    public int minInsertions(String s) {
        int ans=0;
        int open=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
             open++;
            } 
            
            else{  int n = s.length()-1; 
                 if(i+1 <= n && s.charAt(i+1)==')'){ // it means the )) is present we dont need to add something
                    i++;
            } 
               else{
                ans++;
                
               } if(open==0){
                ans++; //  because what if the )) both bracket comes staring 

               } else{
                open --; // because when we get ()) then we have to remove the sixe of open;

               }

            } 
        } 
       int result = ans+ (2*open);
       return result;
    }
}