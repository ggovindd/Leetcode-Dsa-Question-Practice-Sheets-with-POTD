class Solution {
    public long countValidSubstrings(String s) {
       int left = 0;
long count = 0;
        for(int right = 0; right < s.length(); right++) {

            if(right >= 2 && s.charAt(right-2) == 'a' &&
               s.charAt(right-1) == 'b' &&
               s.charAt(right) == 'c') {
                left = right - 1;
            }

            count += right - left + 1;
        }
return count;
    }
}