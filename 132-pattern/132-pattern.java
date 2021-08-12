class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        int mar[] = new int[n];
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n; i++){
            min = Math.min(min, nums[i]);
            mar[i] = min;
        }
        // for(int i:mar){
        //     System.out.println(i);
        // }
        Stack<Integer> st = new Stack<>();
        for(int j = n-1; j>=0 ;j--){
            while(!st.isEmpty() && st.peek() <= mar[j]){
                st.pop();
            }
            if(!st.isEmpty() && st.peek() < nums[j]){
                return true;
            }
            st.push(nums[j]);
        }
        return false;
    }
    
}