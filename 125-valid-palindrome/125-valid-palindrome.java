class Solution {
    public boolean isPalindrome(String s) {
        String fixed = "";
        for(char c : s.toCharArray()) {
            if(Character.isDigit(c) || Character.isLetter(c)) {
                fixed += c;
            }
        }
        fixed = fixed.toLowerCase();
        
        int a = 0;
        int b = fixed.length() - 1;
        
        while(a<=b) {
            if(fixed.charAt(a) != fixed.charAt(b)) {
                return false;
            }
            a++;
            b--;
        }
        return true;
        
    }
}