class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> numerals = new HashMap<>();
        numerals.put('I', 1);
        numerals.put('V', 5);
        numerals.put('X', 10);
        numerals.put('L', 50);
        numerals.put('C', 100);
        numerals.put('D', 500);
        numerals.put('M', 1000);
        
        int res = 0;
        for(int i=0;i<s.length();i++){
            int cur = numerals.get(s.charAt(i));
            if(i<s.length()-1){
                int ne = numerals.get(s.charAt(i+1));
                    if(ne/cur==5 || ne/cur ==10){
                        cur = ne-cur;
                        i++;
                    }
            }
                res += cur;
        }
        return res;
    }
}