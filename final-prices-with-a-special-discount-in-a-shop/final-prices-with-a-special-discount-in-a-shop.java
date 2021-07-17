class Solution {
    public int[] finalPrices(int[] prices) {
        int r[] = getarr(prices);
        int arr[] = new int[r.length];
        // for(int i:r){
        //     System.out.print(i+ " ");
        // }
        for(int i=0;i<r.length;i++){
            if(r[i] >= r.length){
                arr[i] = prices[i];
            }
            else{
                arr[i] = prices[i] - prices[r[i]];
            }
        }
        return arr;
    }
    
    public int[] getarr(int arr[]){
        int n = arr.length;
        int r[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            r[i] = st.isEmpty() ? n:st.peek();
            st.push(i);
        }
        return r;
    }
}