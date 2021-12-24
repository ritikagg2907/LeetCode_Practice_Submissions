class Solution {
    public int[][] merge(int[][] intervals) {
        LinkedList<int[]> arr = new LinkedList<>();
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        Stack<int[]> st = new Stack<>();
        for(int[] num : intervals){
            if(!st.isEmpty()){
                int temp[] = st.peek();
                if(num[0] <= temp[1]){
                    temp[1] = Math.max(num[1], temp[1]);
                    st.pop();
                    st.push(temp);
                }
                else{
                    st.push(num);
                }
            }
            else{
                st.push(num);
            }
        }
        Stack<int[]> st1 = new Stack<>();
        while(!st.isEmpty()){
            st1.push(st.pop());
        }
        int res[][] = new int[st1.size()][2];
        int n = st1.size();
        for(int i=0;i<n;i++){
            res[i] = st1.pop();
        }
        return res;
    }
}