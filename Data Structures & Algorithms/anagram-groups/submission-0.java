class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<String> sorted = new ArrayList<>();
        for(String s: strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            sorted.add(new String(chars));
        }
        List<List<String>> result = new ArrayList<>();
        Map<String,List<Integer>> appearIndex = new HashMap<>();
        for(int i = 0; i < sorted.size(); i++){
            String string = sorted.get(i);
            if(!appearIndex.containsKey(string)){
                appearIndex.put(string, new ArrayList<>(Arrays.asList(i)));
            } else{
                appearIndex.get(string).add(i);
            }
        }
        for(String s: appearIndex.keySet()){
            List<Integer> value = appearIndex.get(s);
            List<String> anagrams = new ArrayList<>();
            for(Integer index: value){
                anagrams.add(strs[index]);
            }
            result.add(anagrams);
        }
        return result;
        
    }
}
