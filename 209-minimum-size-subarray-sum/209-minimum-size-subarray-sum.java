class Solution {
    public int minSubArrayLen(int k, int[] nums) {
        
        int s = 0;
        int res = Integer.MAX_VALUE;
        int sum = 0;
        for(int i =0;i <nums.length; i++){
            sum += nums[i];
            while(sum >= k){
                res = Math.min(res, i-s+1);
                sum -= nums[s];
                s++;
            }
        }
        if(res == Integer.MAX_VALUE){
            res = 0;
        }
        return res;
    }
}