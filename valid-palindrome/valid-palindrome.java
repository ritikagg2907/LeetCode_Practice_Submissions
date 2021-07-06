class Solution {
    public boolean isPalindrome(String s) {
        String str[] = s.split("[\\s@&.?$+-,:#!%_]+");
        String res = "";
        // for(String st : str){
        //     res += st;
        // }
        res = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int  i=0, j=res.length()-1;
        while(i<j){
            if(res.charAt(i) == res.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
       // System.out.println(res);
        return true;
    }
}