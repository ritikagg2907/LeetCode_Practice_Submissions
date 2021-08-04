class Solution {
    public int minSetSize(int[] arr) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: arr){
            map.put(i, map.getOrDefault(i, 0) +1);
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            p.add(e.getValue());
        }
        int cur = arr.length;
        int c = 0;
        while(p.size() != 0 && cur > arr.length/2){
            int t = p.poll();
            cur -= t;
            c++;
        }
        return c;
    }
}