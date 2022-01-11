class Solution {
    public int maximumDifference(int[] nums) {
        int maxc = 0;
        int maxa = 0;
        for(int i =1; i <nums.length; i++){
            maxc = Math.max(0, maxc += nums[i]-nums[i-1]);
            maxa = Math.max(maxc, maxa);
        }
        if(maxa == 0){
            return -1;
        }
        return maxa;
    }
}