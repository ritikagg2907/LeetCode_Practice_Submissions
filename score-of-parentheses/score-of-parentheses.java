class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                st.push(-1);
            }
            else{
                int count = 0;
                if(st.peek() == -1){
                    st.pop();
                    st.push(1);
                } 
                else{
                    while(!st.isEmpty() && st.peek() != -1){
                        count += st.pop();
                    }
                    st.pop();
                    st.push(2*count);
                }
            }
        }
        int cou = 0;
        while(!st.isEmpty()){
            cou += st.pop();
        }
        st.push(cou);
        return st.peek();
    }
}