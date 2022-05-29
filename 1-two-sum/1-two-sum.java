class Solution {
    public int[] twoSum(int[] nums, int target) {

        //two for loops that check each number against eachother until it finds a match
        //then add the correct integers into a list

        int[] solution = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int tester = nums[i] + nums[j];
                if (tester == target) {
                    
                        solution[0] = i;
                    solution[1] = j;
                    
                }
            }
        }
        return solution;
    }
}