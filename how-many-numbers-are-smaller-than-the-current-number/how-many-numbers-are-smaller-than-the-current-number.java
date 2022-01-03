class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int max = -1;
        for(int i:nums){
            max = Math.max(max,  i);
        }
        int arr[] = new int[max+1];
        int res[] = new int[nums.length];
        for(int i=0;i<nums.length; i++){
            arr[nums[i]]++;
        }
        for(int  i=1;i<max+1;i++){
            arr[i] += arr[i-1];
        }
        for(int i=0;i<nums.length;i++){
            int b = nums[i];
            nums[i] = b==0? 0:arr[b-1];
        }
        return nums;
    }
}