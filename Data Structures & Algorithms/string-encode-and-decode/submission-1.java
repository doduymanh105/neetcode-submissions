class Solution {

    public String encode(List<String> strs) {
        StringBuilder string = new StringBuilder();
        for(String s : strs){
            string.append(s.length());
            string.append("#");
            string.append(s);
        }
        return string.toString();
    }

    // int delimiter = str.indexOf('#', i);
    // length = Integer.parseInt(str.substring(i, delimiter));

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        // int length = str.length();
        int index =0;
        while(true){
            if(str.length()==0) break;
            int delimiter = str.indexOf('#');
            int length = Integer.parseInt(str.substring(index, delimiter));
            String s = str.substring(delimiter +1, delimiter + length +1);
            result.add(s);
            str = str.substring(delimiter + length+1);
        }
        return result;
        
    }
}
