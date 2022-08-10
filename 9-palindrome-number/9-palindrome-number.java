class Solution {
    public boolean isPalindrome(int x) {
      String str = Integer.toString(x);
        boolean answer = false;
        if (str.length() < 1) {
            return false;
        }
        int i = 0;
        int j = str.length() - 1;
        while (j > i) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
}
}