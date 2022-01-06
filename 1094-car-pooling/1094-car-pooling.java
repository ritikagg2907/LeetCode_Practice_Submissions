class Solution {
    public boolean carPooling(int[][] trips, int cap) {  
    
        Arrays.sort(trips, (a,b)->Integer.compare(a[1], b[1]));
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[2], b[2]));
        
        for(int[] i : trips){
            while(!pq.isEmpty() && pq.peek()[2] <= i[1]){
                cap += pq.poll()[0];
            }
            cap -= i[0];
            pq.add(i);
            if(cap <0){
                return false;
            }
        }
        return true;
    }
}