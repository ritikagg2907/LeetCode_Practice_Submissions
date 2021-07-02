class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> arr = new ArrayList<List<String>>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        if(strs.length == 0){
            return arr;
        }
        for(String s : strs){
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String str = String.valueOf(c);
            if(map.containsKey(str)){
                ArrayList<String> li = map.get(str);
                li.add(s);
                map.put(str, li);
            }
            else{
                ArrayList<String> li = new ArrayList<>();
                li.add(s);
                map.put(str,li);
            }
        }
        for(Map.Entry<String, ArrayList<String>> e : map.entrySet()){
            arr.add(e.getValue());
        }
        return arr;
    }
}