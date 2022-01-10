class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        int res = 0;
        for(String s : words){
            StringBuilder input1 = new StringBuilder();
            input1.append(s);
            String t = input1.reverse().toString();
            if(map.containsKey(t)){
                if(map.get(t)==1){
                    map.remove(t);
                }
                else{
                    int b = map.get(t);
                    b--;
                    map.put(t,b);
                }
                res+=4;
            }
            else{
                map.put(s, map.getOrDefault(s,0)+1);
            }
        }
        for(Map.Entry<String, Integer> e : map.entrySet()){
            String s = e.getKey();
            if(s.charAt(0) == s.charAt(1)){
                res += 2;
                break;
            }
        }
        return res;
    }
}