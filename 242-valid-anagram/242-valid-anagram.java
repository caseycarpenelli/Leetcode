class Solution {
    public boolean isAnagram(String s, String t) {
        
        List<Character> bank1 = new ArrayList<>();
        List<Character> bank2 = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            bank1.add(s.charAt(i));
        }
        for(int i = 0; i < t.length(); i++) {
            bank2.add(t.charAt(i));
        }
        Collections.sort(bank1);
        Collections.sort(bank2);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (Character ch: bank1) {
            sb1.append(ch);
        }
        for (Character ch: bank2) {
            sb2.append(ch);
        }
        

        
        if(sb1.toString().compareTo(sb2.toString()) == 0) {
            return true;
        } else {
            return false;
        }
    }
}