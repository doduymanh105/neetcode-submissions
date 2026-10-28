class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for(int i=0; i < nums.length; i ++){
            int remain = target -nums[i];
            if(seen.containsKey(remain)){
                return new int[]{seen.get(remain), i};
            } else {
                seen.put(nums[i], i);
            }
        }
        return new int[]{0,0};
    }
}
