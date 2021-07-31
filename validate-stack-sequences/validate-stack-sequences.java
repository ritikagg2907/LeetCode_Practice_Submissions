class Solution {
    public boolean validateStackSequences(int[] pu, int[] po) {
        Stack<Integer> st = new Stack<>();
        int j=0;
        for(int i=0;i<pu.length;i++){
            if(pu[i] == po[j]){
                j++;
            }
            else{
                while(!st.isEmpty() && st.peek() == po[j]){
                    j++;
                    st.pop();
                }
                st.push(pu[i]);
            }
        }
        while(!st.isEmpty() && st.peek() == po[j]){
                    j++;
                    st.pop();
                }
        if(j==po.length){
            return true;
        }
        return false;
    }
}