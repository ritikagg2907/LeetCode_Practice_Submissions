class Solution {
    public void reverseString(char[] s) {
        // for(int i=0;i<s.length/2;i++){
        //     char c = s[i];
        //     char c1 = s[s.length-1-i];
        //     s[i] = c1;
        //     s[s.length-1-i] = c;
        // }
        rev(s,0);
    }
    
    public void rev(char s[], int i){
        if(i>=s.length/2){
            return ;
        }
        char c = s[i];
        char c1 = s[s.length-1-i];
        s[i] = c1;
        s[s.length-1-i] = c;
        rev(s,i+1);
    }
}