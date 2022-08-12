class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> newMap = new HashMap<>();
        newMap.put('I', 1);
        newMap.put('V', 5);
        newMap.put('X', 10);
        newMap.put('L', 50);
        newMap.put('C', 100);
        newMap.put('D', 500);
        newMap.put('M', 1000);
       
        int n = s.length();
        
        int num = newMap.get(s.charAt(n - 1));
        
        for (int i = n - 2; i >= 0; i--) {
           
            if (newMap.get(s.charAt(i)) >= newMap.get(s.charAt(i + 1))) {
                num += newMap.get(s.charAt(i));
            } else {
                num -= newMap.get(s.charAt(i));
            }
        }
        return num;
    }
}