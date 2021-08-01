class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
           char sub = s.charAt(i);
            // System.out.println("sub " + sub);
            if(sub == '('){
                st.push(sub);
            }
            else if(sub == ')'){
                // System.out.println("exec");
                StringBuilder sb = new StringBuilder();
                while(!st.isEmpty() && st.peek() != '('){
                    sb.append(st.pop());
                } 
                String temp = sb.toString();
                st.pop();
                for(int j=0 ; j<temp.length(); j++){
                    st.push(temp.charAt(j));
                }
            }
            else{
                st.push(sub);
            }
        }
        char ch[] = new char[st.size()];
        for(int i=st.size()-1; i>=0; i--){
            ch[i] = st.pop();
        }
        return String.valueOf(ch);//st.peek();
    }
}