class Solution {
    public boolean isPalindrome(String s) {
        String str[] = s.split("[\\s@&.?$+-,:#!%_]+");
        String all = "";
        for(String i : str){
            all += i;
        }
        all = all.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int i = 0;
        int j = all.length()-1;
        while(i<=j){
            if(all.charAt(i) == all.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}