class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> containerS = new HashMap<>();
        for(int i = 0; i< s.length(); i++){
            Character c =(Character) s.charAt(i);
            if(containerS.containsKey(c)){
                containerS.put(c, containerS.get(c)+1);
            } else {
                containerS.put(c, 1);
            }
        }
        Map<Character, Integer> containerT = new HashMap<>();
        for(int i = 0; i< t.length(); i++){
            Character c =(Character) t.charAt(i);
            if(containerT.containsKey(c)){
                containerT.put(c, containerT.get(c)+1);
            } else {
                containerT.put(c, 1);
            }
        }
        for(Character c : containerS.keySet()){
            if(!containerS.get(c).equals(containerT.get(c))){
                return false;
            }
        }
        return true;
    }
}