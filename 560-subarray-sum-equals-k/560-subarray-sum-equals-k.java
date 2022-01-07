class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int res=0;
        for(int i : nums){
            sum += i;
            int cur = sum - k;
            if(map.containsKey(cur)){
                res += map.get(cur);
            }
            if(map.containsKey(sum)){
                int b = map.get(sum);
                b++;
                map.put(sum,b);
            }
            else{
                map.put(sum, 1);
            }
        }
        return res;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//         int count = 0;
// 	    int i=0;int j=0;
// 	    int csum = 0;
// 	    while(j<nums.length) {
// //	    	System.out.println("Something");
// 	    	csum += nums[j];
// 	    	j++;
// 	    	while(i<j && csum > k) {
// 	    		csum -= nums[i];
// 	    		i++;
// 	    	}
// 	    	if(csum == k) {
// 	    		count ++;
// 	    	}
// 	    }
// 		return count;
    }
}