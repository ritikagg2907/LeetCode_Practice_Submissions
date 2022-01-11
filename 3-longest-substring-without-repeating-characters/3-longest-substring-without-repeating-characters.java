class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> set = new HashSet<>();
        if(s.length() == 0){
            return 0;
        }
        int i = 0;
        int j = 0;
        int max = 0;
        while(j < s.length()){
            char c = s.charAt(j);
            if(!set.contains(c)){
                set.add(c);
                j++;
                max = Math.max(max, j-i);
            }
            else{
                while(set.contains(c)){
                    set.remove(s.charAt(i));
                    i++;
                }
            }
        }
        return max;
        
        
        
//         Set<Character> set = new HashSet<>();
//         int max = 0;
//         if(s.length() == 0){
//             return max;
//         }
//         int i = 0;
//         int j = 0;
//         while(j<s.length()){
//             char c = s.charAt(j);
//             if(!set.contains(c)){
//                 set.add(c);
//                 j++;
//                 max = Math.max(max, set.size());
//             }
//             else{
//                 set.remove(s.charAt(i++));
//             }
//         }
//         return max;
    }
}