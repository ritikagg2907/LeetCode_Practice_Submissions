class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int max = nums[0];
        int min = nums[0];
        int pm = nums[0];
        int pmin = nums[0];
        
        for(int i=1; i < nums.length ; i ++){
            max = Math.max(pm*nums[i], Math.max(nums[i]*pmin, nums[i]));
            min = Math.min(pm*nums[i], Math.min(nums[i]*pmin, nums[i]));
            ans = Math.max(ans, max);
            pm = max;
            pmin = min;            
        }
        return ans;
        
        
    }
}