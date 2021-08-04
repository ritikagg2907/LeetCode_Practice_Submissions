class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length; i++){
            p.add(nums[i]);
        }
        return (p.poll() - 1) * (p.poll()-1);
    }
}