class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) {
            return 0;
        }
        HashSet<Character> reference = new HashSet<>();
        int other = 0;
        int returnable = 0;
        for(int i = 0; i < s.length(); i++) {
            while(reference.contains(s.charAt(i))) {
                reference.remove(s.charAt(other));
                other++;
            }
            reference.add(s.charAt(i));
            returnable = Math.max(returnable, i - other + 1);
        }
        return returnable;
    }
}