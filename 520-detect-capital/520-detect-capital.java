class Solution {
    public boolean detectCapitalUse(String word) {
        String ac = word.toUpperCase();
        String nc = word.toLowerCase();
        String fc = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
        if(word.equals(ac) || word.equals(nc) || word.equals(fc)){
            return true;
        }
        return false;
    }
}