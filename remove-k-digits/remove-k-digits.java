class Solution {
    public String removeKdigits(String num, int k) {
        if(k==num.length()){
            return "0";
        }
        Stack<Character> st = new Stack<>();
        for(char c : num.toCharArray()){
            while(!st.isEmpty()&& k>0 && st.peek() > c){
                st.pop();
                k--;
            }
            st.push(c);
        }
        while(k-- >0 ){
            st.pop();
        }
        char arr[] = new char[st.size()];
        int i = arr.length - 1;
        while(i>=0) arr[i--] = st.pop();
        int j = 0;
        while(j<arr.length && arr[j] == '0') j++;
        StringBuilder sb = new StringBuilder();
        for(int t=j; t<arr.length;t++){
            sb.append(arr[t]);
        }
        if(sb.length() == 0){
            return "0";
        }
        return sb.toString();
    }
}