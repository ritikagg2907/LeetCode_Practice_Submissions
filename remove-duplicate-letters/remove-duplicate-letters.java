class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st = new Stack<>();
        int f[] = new int[26];
        boolean e[] = new boolean[26];
        for(char c : s.toCharArray()){
            f[c-'a']++;
        }
        for(int i=0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            f[c-'a']--;
            if(e[c-'a']) continue;
            while(!st.isEmpty() && st.peek() > c && f[st.peek() -'a'] >0){
                e[st.peek() - 'a'] = false;
                st.pop();
            }
            st.push(c);
            e[c-'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}