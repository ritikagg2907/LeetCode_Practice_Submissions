class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String s : words){
            map.put(s, map.getOrDefault(s,0)+1);
        }
        PriorityQueue<String> p = new PriorityQueue<>((a,b) -> (map.get(a) == map.get(b) ? a.compareTo(b) : map.get(b) - map.get(a) ));
        p.addAll(map.keySet());
        List<String> a = new ArrayList<>();
        for(int i=0;i<k;i++){
            a.add(p.poll());
        }
        return a;
    }
}