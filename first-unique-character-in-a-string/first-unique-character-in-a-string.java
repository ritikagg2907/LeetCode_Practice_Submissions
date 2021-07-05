class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i =0 ;i< s.length(); i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                int b = map.get(c);
                b++;
                map.put(c,b);
            }
        }
        for(int i = 0;i <s.length(); i ++){
            char c = s.charAt(i);
            if(map.get(c) == 1){
                return i;
            }
        }
        return -1;
    }
}