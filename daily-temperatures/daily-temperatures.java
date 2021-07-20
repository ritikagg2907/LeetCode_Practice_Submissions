class Solution {
    public int[] dailyTemperatures(int[] t) {
        int r[] = ri(t);
        int res[] = new int[r.length];
        for(int i =0 ;i<r.length ; i ++){
            if(r[i] == r.length){
                res[i] = 0;
            }
            else{
                res[i] = r[i] - i;
            }
        }
        return res;
    }
    
    public int[] ri(int arr[]){
        int n = arr.length;
        int r[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            r[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return r;
            
    }
}