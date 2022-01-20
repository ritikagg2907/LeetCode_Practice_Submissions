class Solution {
    public int minEatingSpeed(int[] nums, int h) {
        int max = 0;
        for(int i : nums){
            max = Math.max(max, i);
        }
        int s = 1;
        int e = max;
        while(s < e){
            int mid = (e+s)/2;
            // System.out.println(mid);
            int t = 0;
            for(int i : nums){
                t += Math.ceil((double)i/mid);
            }
            if(t <= h){
                e = mid;
            }
            else{
                s = mid+1;
            }
        }
        return e;
    }
    
}