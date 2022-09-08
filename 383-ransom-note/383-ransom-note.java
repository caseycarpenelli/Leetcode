class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) {
            return false;
        }
        List<Character> bank = new ArrayList<>();
        for(int i = 0; i < magazine.length(); i++) {
            bank.add(magazine.charAt(i));
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(bank.contains(ransomNote.charAt(i))) {
                int index = bank.indexOf(ransomNote.charAt(i));
                bank.remove(index);
                System.out.println(index);
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}