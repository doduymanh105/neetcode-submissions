class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    
        Map<Integer, Integer> seenTime = new HashMap<>();
        for (int i=0; i< nums.length; i++){
            seenTime.put(nums[i], seenTime.getOrDefault(nums[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> frequent = new ArrayList<>(seenTime.entrySet());
        frequent.sort((a, b)-> b.getValue().compareTo(a.getValue()));

        int[] topFrequent = new int[k];

        for(int i=0; i < k; i++){
            topFrequent[i] = frequent.get(i).getKey();
        }


        return topFrequent;

    }
}
