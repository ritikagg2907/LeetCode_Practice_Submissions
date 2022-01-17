class Solution {
    public int search(int[] nums, int t) {
        int s = 0;
        int e = nums.length-1;
        int ans = -1;
        while(s<=e){
            int mid = (s+e)/2;
            if(nums[mid] == t){
                ans = mid;
                break;
            }
            else if(nums[mid] > t){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return ans;
    }
}