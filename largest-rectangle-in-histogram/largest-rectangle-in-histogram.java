class Solution {
    public int largestRectangleArea(int[] arr) {
        int l[] = left(arr);
        int r[] = right(arr);
        
        for(int i:l){
            System.out.print(i + " " );
        }
        System.out.println();
        for(int i:r){
            System.out.print(i + " " );
        }
        int max = 0;
        for(int i=0;i<arr.length; i++){
            int h = r[i] - l[i] -1;
            int w = arr[i];
            max = Math.max(max, h*w);
        }
        return max;
    }
    
    public int[]  left(int arr[]){
        int n = arr.length;
        int l[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] >=arr[i]){
                st.pop();
            }
            l[i] = st.isEmpty() ? -1: st.peek();
            st.push(i);
        }
        return l;
    }
    
    public int[]  right(int arr[]){
        int n = arr.length;
        int l[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1 ;i >= 0;i--){
            while(!st.isEmpty() && arr[st.peek()] >=arr[i]){
                st.pop();
            }
            l[i] = st.isEmpty() ? n: st.peek();
            st.push(i);
        }
        return l;
    }
}