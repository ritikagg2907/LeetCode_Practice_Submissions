class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i ++){
            int n = nums[i];
            if(!map.containsKey(n)){
                map.put(n,i);
            }
            else{
                int id = map.get(n);
                if(Math.abs(i-id)<=k){
                    return true;
                }
                else{
                    map.put(n,i);
                }
            }
        }
        return false;
    }
}