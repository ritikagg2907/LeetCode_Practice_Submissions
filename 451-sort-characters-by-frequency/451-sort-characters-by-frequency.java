class Solution {
    public String frequencySort(String s) {
        // HashMap<Character, Integer> map = new HashMap<>();
        // for(int i=0;i<s.length(); i++){
        //     char c = s.charAt(i);
        //     map.put(c, map.getOrDefault(c,0)+1);
        // }
        // PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        // pq.addAll(map.keySet());
        // StringBuilder sb = new StringBuilder();
        // while(pq.size() != 0){
        //     char c = pq.poll();
        //     int f = map.get(c);
        //     for(int i=0; i< f; i++){
        //         sb.append(c);
        //     }
        // }
        // return sb.toString();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        PriorityQueue<Character> p = new PriorityQueue<>((a,b) -> (map.get(a) - map.get(b)));
        p.addAll(map.keySet());
        StringBuilder sb = new StringBuilder();
        while(p.size() != 0){
            char c = p.poll();
            for(int i=0;i<map.get(c);i++){
                sb.append(c);
            }
        }
        return sb.reverse().toString();
    }
}