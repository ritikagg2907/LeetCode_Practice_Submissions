class Solution {
    public boolean wordPattern(String pat, String s) {
        String str[] = s.split(" ");
        // for(String st : str){
        //     System.out.println(st);
        // }
        if(pat.length() != str.length){
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        for(int i=0;i<pat.length(); i++){
            char c = pat.charAt(i);
            String cur = str[i];
            if(!map.containsKey(c)){
                map.put(c, cur);
            }
            else {
                if(!map.get(c).equals(cur)){
                    return false;
                }
            }
        }
        HashMap<String, Integer> map1 = new HashMap<>();
        for(String st : str){
            map1.put(st, map1.getOrDefault(st, 0) + 1);
        }
        if(map1.size() < map.size()){
            return false;
        }
        return true;
    }
}