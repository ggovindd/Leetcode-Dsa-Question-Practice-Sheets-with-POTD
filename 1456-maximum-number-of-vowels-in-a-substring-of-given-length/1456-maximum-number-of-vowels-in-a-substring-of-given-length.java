class Solution {
    public int maxVowels(String s, int k) {
       
//         int max=0;
//         for(int i=0;i<=s.length()-k;i++){
//              int count=0;
//             for(int j=i;j<i+k;j++){
//                 if(s.charAt(j) == 'i' || s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'u' || s.charAt(j) == 'o'){
//                     count++;
//                 }
//             } 
//             max=Math.max(max,count);

//         }
//  return max;

    int max=0;
    int j=0;
    int i=0;
    int count=0;
     while(i<s.length()){
        if(s.charAt(i) == 'i' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'u' || s.charAt(i) == 'o'){
            count++;
     } 
        if(i-j+1 == k){
            max=Math.max(max,count);
           
            if(s.charAt(j) == 'i' || s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'u' || s.charAt(j) == 'o'){
            count--;} j++;
        } 
        i++;
     
    } return max;
    }
}