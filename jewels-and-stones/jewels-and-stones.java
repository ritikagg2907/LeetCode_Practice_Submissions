class Solution {
    public int numJewelsInStones(String j, String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = j.length();
        int m = s.length();
        int count = 0;
        if(n<m){
            for(int i=0;i<m;i++){
                char c = s.charAt(i);
                if(!map.containsKey(c)){
                    map.put(c, 1);
                }
                else{
                    int b = map.get(c);
                    b++;
                    map.put(c,b);
                }
            }
            for(int i=0;i<n;i++){
                char c = j.charAt(i);
                if(map.containsKey(c)){
                    count += map.get(c);
                }
            }
        }
        else{
            for(int i=0;i<n;i++){
                char c = j.charAt(i);
                if(!map.containsKey(c)){
                    map.put(c, 1);
                }
                else{
                    int b = map.get(c);
                    b++;
                    map.put(c,b);
                }
            }
            for(int i=0;i<m;i++){
                char c = s.charAt(i);
                if(map.containsKey(c)){
                    count += map.get(c);
                }
            }
        }
        
        return count;
    }
}