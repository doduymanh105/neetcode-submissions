class Solution {
    public int[] twoSum(int[] nums, int target) {
        int currentIndex =0;
        int currentIndexNext =0;
        for(int i =0; i< nums.length; i ++){
            for(int j = i+1; j< nums.length; j++){
                if(
                    nums[i] + nums[j] == target
                ) {
                    currentIndex = i;
                    currentIndexNext = j;
                }
            }
        }
        return new int[]{currentIndex, currentIndexNext};
    }
}
