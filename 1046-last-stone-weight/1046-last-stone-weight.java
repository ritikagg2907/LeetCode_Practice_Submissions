class Solution {
    public int lastStoneWeight(int[] nums) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums){
            p.add(i);
        }
        while(p.size() >= 2){
            int a = p.remove();
            int b = p.remove();
            if(a!=b){
                p.add(Math.abs(a-b));
            }
        }
        if(p.size() == 0){
            return 0;
        }
        // else if(p.size() == 1){
        //     return p.remove();
        // }
        return p.remove();
        // else{
        // int a = p.remove();
        // int b = p.remove();
        // if(a!=b){
        //     p.add(Math.abs(a-b));
        // }
        // return p.remove();
        // }
        
    }
}