class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<score.length; i++){
            int num = score[i];
            map.put(num, i);
        }
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:score){
            p.add(i);
        }
        String res[] = new String[score.length];
        res[map.get(p.poll())] = "Gold Medal";
        if(p.size() > 0) res[map.get(p.poll())] = "Silver Medal";
        if(p.size() > 0) res[map.get(p.poll())] = "Bronze Medal";
        int c = 4;
        int cu = p.size();
        // System.out.println(cu);
        for(int i=0 ;i< cu ;i++){
            res[map.get(p.poll())] = Integer.toString(c);
            c++;
        }
        return res;
    }
}