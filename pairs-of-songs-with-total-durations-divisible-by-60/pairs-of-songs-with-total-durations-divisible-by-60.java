class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int arr[] = new int[60];
        for(int i:time){
            arr[i%60]++;
        }
        int res = 0;
        res += arr[0]*(arr[0]-1)/2;
        res += arr[30]*(arr[30]-1)/2;
        
        for(int i=1; i<30;i++){
            res += arr[i]*arr[60-i];
        }
        return res;
    }
}