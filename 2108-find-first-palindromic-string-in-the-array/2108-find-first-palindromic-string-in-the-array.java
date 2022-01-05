class Solution {
    public String firstPalindrome(String[] words) {
        int min = 101;
        for(int k= 0 ; k<words.length; k++){
            int j = words[k].length()-1;
            int i = 0;
            while(i<=j){
                if(words[k].charAt(i) == words[k].charAt(j)){
                    i++;
                    j--;
                    if(i>=j){
                        min = Math.min(min, k);
                    }
                }
                else{
                    break;
                }
            }
        }
        if(min !=101){
            return words[min];
        }
        return "";
    }
}