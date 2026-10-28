class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> container = new ArrayList<>();
        for (int i: nums){
            if(container.contains(i)) {
                return true;
                } else {
                    container.add(i);
                }
        }
        return false;
    }
}