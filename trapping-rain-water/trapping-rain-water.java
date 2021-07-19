class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n==0){
            return 0;
        }
        int al[] = new int[n];
        int ar[] = new int[n];
        al[0] = height[0];
        for(int i=1;i<n;i++){
            al[i] = Math.max(al[i-1] , height[i]);
        }
        ar[n-1] = height[n-1];
        for(int i=n-2; i>=0 ;i--){
            ar[i] = Math.max(ar[i+1] , height[i]);
        }
        int res = 0;
        for(int i=0;i < n; i++){
            res += Math.min(ar[i], al[i]) - height[i];
        }
        return res;
    }
}