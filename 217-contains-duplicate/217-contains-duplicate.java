class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> bank = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(bank.contains(nums[i])) {
                return true;
            }
            bank.add(nums[i]);
        }
        return false;
    }
}