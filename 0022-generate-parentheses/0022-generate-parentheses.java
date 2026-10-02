class Solution { 
    public List<String> generateParenthesis(int n) {
     List<String> ans=new ArrayList<>();
      StringBuilder sb = new StringBuilder();
       solve(n,sb,ans);
       return ans;
    } 
    void solve(int n, StringBuilder sb,List<String> ans){
            if(sb.length() == 2*n){
                if(isvalid(sb.toString())){
                    ans.add(sb.toString());
                }
                return;
            }
            sb.append('(');
            solve(n,sb,ans);
            sb.deleteCharAt(sb.length()-1);        

            sb.append(')'); // for backtracking 
            solve(n,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        
    }   boolean isvalid(String s) {

        if (s.length()%2 != 0) return false;
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i); 
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            } else if(!st.isEmpty() && ((ch == '}' && st.peek() == '{') || (ch == ')' && st.peek() == '(') || (ch == ']' && st.peek() == '['))){
                st.pop();
            } else{
                return false;
            }
        } return st.isEmpty();}
}