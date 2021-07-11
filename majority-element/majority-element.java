class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i , map.getOrDefault(i,0)+1);
        }
        // System.out.println(map);
        int half = nums.length/2;
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(e.getValue() > half){
                return e.getKey();
            }
        }
        return 1;
    }
}