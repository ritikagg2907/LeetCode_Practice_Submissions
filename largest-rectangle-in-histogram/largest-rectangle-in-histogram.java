class Solution {
    public int largestRectangleArea(int[] heights) {
        int l[] = left(heights);
        int r[] = right(heights);
        int max = 0;        
        for(int i = 0 ; i<l.length ; i++){
            int w  =r[i] - l[i] - 1;
            int are = w*heights[i];
            max = Math.max(are,max);
        }
        return max;
    }
    
    public int[] left(int arr[]){
        int l[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            l[i] = st.isEmpty() ? -1: st.peek();
            st.push(i);
        }
        return l;
    }
    
    public int[] right(int arr[]){
        int r[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length - 1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            r[i] = st.isEmpty() ? arr.length: st.peek();
            st.push(i);
        }
        return r;
    }
}