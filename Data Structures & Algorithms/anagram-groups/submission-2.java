class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> resultMap = new HashMap<>();

        for(String str : strs){
            char[] cArr = new char[26];
            for(char ch : str.toCharArray()){
                cArr[ch-'a']++;
            }
            // if is anagram, it will have same appearence time
            String s = new String(cArr);
            resultMap.putIfAbsent(s, new ArrayList<>());
            resultMap.get(s).add(str);
        }
        return new ArrayList<>(resultMap.values());
    }
}
