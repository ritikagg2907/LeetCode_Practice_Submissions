class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i:nums) {
        	if(!map.containsKey(i)) {
        		map.put(i, 1);
        	}
        }
        int  c = 0;
        for(int i=0; i< n; i++) {
        	int cc = 0;
        	int j=i;
        	if(!map.containsKey(nums[j]-1)) {
        		int tf = nums[j];
        		while(j<n && map.containsKey(tf+1)) {
        			cc++;
        			tf++;
        		}
        	}
        	c = Math.max(c, cc+ 1);
        }
        return c;
        // int max = 0;
        // for(int i : nums) {
        // 	max = Math.max(max,  i);
        // }
        // boolean set[] = new boolean[max+1];
        // Arrays.fill(set, false);
        // for(int i:nums) {
        // 	set[i] = true;
        // }
        // int res = 0;
        // for(int i=0;i<set.length; i++) {
        // 	int j=i;
        // 	while(j<set.length && set[j] != true) {
        // 		j++;
        // 	}
        // 	i=j;
        // 	while(j<set.length && set[j] != false) {
        // 		j++;
        // 	}
        // 	res = Math.max(res,  j-i);
        // }
        // return res;
    }
}