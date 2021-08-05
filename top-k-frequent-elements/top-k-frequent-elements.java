class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> p = new PriorityQueue<>((a,b) -> (map.get(b) - map.get(a)));
        p.addAll(map.keySet());
        int res[] = new int[k];
        for(int i=0;i<k;i++){
            res[i] = p.poll();
        }
        return res;
    }
}