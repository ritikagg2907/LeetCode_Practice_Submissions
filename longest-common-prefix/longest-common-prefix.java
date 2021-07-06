class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        if(strs.length==0){
            return "";
        }
        String first = strs[0];
        String last = strs[strs.length-1];
        String res = "";
        for(int i=0;i<Math.min(last.length(), first.length()); i++){
            if(first.substring(i,i+1).equals(last.substring(i,i+1))){
                res+= first.substring(i,i+1);
            }
            else{
                break;
            }
        }
        return res;
    }
}