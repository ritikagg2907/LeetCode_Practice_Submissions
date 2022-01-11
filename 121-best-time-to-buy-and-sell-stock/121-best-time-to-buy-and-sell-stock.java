class Solution {
    public int maxProfit(int[] prices) {
        int l = Integer.MAX_VALUE;
        int po = 0;
        int res = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i] < l){
                l = prices[i];
            }
            po = prices[i] - l;
            res = Math.max(res, po);
        }
        return res;
    } 
}