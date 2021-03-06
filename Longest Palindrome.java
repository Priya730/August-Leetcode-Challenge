class Solution {
    public int longestPalindrome(String s) {
         int result = 0; 
        char[] chArr = new char[128];
        for(char ch : s.toCharArray())
           chArr[ch]++;
        for(int count : chArr) {
            if(count % 2 == 0) {
                result = result + count;
            }
            else if(count/2 >= 1) {
                result = result + count - 1;
            }
        }
        return result + (s.length() > result ? 1 : 0);
    }
}
