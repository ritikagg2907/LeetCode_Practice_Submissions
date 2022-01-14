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
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // int l = Integer.MAX_VALUE;
        // int po = 0;
        // int res = 0;
        // for(int i=0; i<prices.length; i++){
        //     if(prices[i] < l){
        //         l = prices[i];
        //     }
        //     po = prices[i] - l;
        //     res = Math.max(res, po);
        // }
        // return res;
    } 
}