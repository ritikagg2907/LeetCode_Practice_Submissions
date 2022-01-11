class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        int sum = 0;
        map.put(0,1);
        for(int i=0; i < nums.length; i++){
            sum += nums[i];
            int rsum = sum - k;
            if(map.containsKey(rsum)){
                res += map.get(rsum);
            }
            map.put(sum , map.getOrDefault(sum, 0)+1);
        }
        
        return res;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // HashMap<Integer, Integer> map = new HashMap<>();
        // map.put(0,1);
        // int sum = 0;
        // int res=0;
        // for(int i : nums){
        //     sum += i;
        //     int cur = sum - k;
        //     if(map.containsKey(cur)){
        //         res += map.get(cur);
        //     }
        //     if(map.containsKey(sum)){
        //         int b = map.get(sum);
        //         b++;
        //         map.put(sum,b);
        //     }
        //     else{
        //         map.put(sum, 1);
        //     }
        // }
        // return res;
    }
}