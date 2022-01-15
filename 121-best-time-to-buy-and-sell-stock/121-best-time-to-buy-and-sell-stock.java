class Solution {
    public int maxProfit(int[] prices) {
        
        int min = Integer.MAX_VALUE;
        int res = 0;
        for(int i : prices){
            if(i < min){
                min = i;
            }
            res = Math.max(res, i-min);
        }
        return res;
    } 
}