class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>(k); // Collections.reverseOrder()
        for(int i:nums){
            if(p.size() < k){
                p.add(i);
            }
            else{
                if(p.peek() < i){
                    p.poll();
                    p.add(i);
                }
            }
            // System.out.println(p.peek());
        }
        return p.poll();
    }
}