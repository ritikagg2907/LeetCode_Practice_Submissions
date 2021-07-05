class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int total = 0;
        for(int i : nums){
            total += i;
        }
        int sum = calc(nums, 0, nums.length-1);
        int rem = total - sum;
        return sum >= rem;
    }
    
    public int calc(int arr[], int i, int j){
        if(i>j){
            return 0;
        }
        int sum = Math.max(arr[i] + Math.min(calc(arr, i+2,j), calc(arr,i+1,j-1)) , arr[j] + Math.min(calc(arr, i+1,j-1), calc(arr,i,j-2)));
        return sum;
    }
}