class Solution {
    public String capitalizeTitle(String str) {
        String arr[] = str.split("\\s+");
        String res = "";
        for(int i=0;i<arr.length-1; i++){
            String s = arr[i];
            s = s.toLowerCase();
            if(s.length() >2){
                String t = s.substring(0,1).toUpperCase();
                res += t + s.substring(1, s.length()) + " " ;
            }
            else{
                res += s + " ";
            }
        }
        String s = arr[arr.length-1];
        s = s.toLowerCase();
        if(s.length() >2){
            String t = s.substring(0,1).toUpperCase();
            res += t + s.substring(1, s.length());
        }
        else{
            res += s;
        }
        return res; 
    }
}