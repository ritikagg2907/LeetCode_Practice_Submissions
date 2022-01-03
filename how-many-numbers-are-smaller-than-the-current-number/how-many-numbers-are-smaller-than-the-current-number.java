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
       
        int res2[] = new int[arr.length];
        for(int i=1;i<max+1;i++) {
        	res2[i] = arr[i-1]+res2[i-1];
        }
        for(int i=0;i<nums.length;i++) {
        	res[i] = res2[nums[i]];
        }
        return res;
    }
}