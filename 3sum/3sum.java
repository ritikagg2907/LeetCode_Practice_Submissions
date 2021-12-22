class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ar = new ArrayList<List<Integer>>();
		if(nums.length < 3) {
			return ar;
		}
		Arrays.sort(nums);
		for(int i=0;i<nums.length-2; i++) {
			if(i == 0 || (i>0 && nums[i] != nums[i-1])) {
				int f = nums[i];
				int j = i+1;
				int k = nums.length -1;
				while(j<k) {
					if(nums[j] + nums[k] + f == 0) {
						List<Integer> ne = new ArrayList<>();
						ne.add(f);
						ne.add(nums[j]);
						ne.add(nums[k]);
						ar.add(ne);
                        j++;
                        k--;
                        while(j<k && nums[j] == nums[j-1]) j++;
                        while(j<k && nums[k] == nums[k+1]) k--;
					}
					else if(nums[j] + nums[k] + f >0) {
						k--;
					}
					else {
						j++;
					}
				}
			}
		}
		return ar;
//         List<List<Integer>> arr = new ArrayList<>();
//         if(nums.length < 3){
//             return arr;
//         }
//         Arrays.sort(nums);
//         for(int i=0; i<nums.length -2; i++){
//             if(i == 0 || (i>0 && nums[i] !=nums[i-1])){
                
//                 int s = i+1;
//                 int e = nums.length -1;
//                 int sum = 0-nums[i];
                
//                 while(s<e){
//                     if(nums[s] + nums[e] == sum){
//                         arr.add(Arrays.asList(nums[i], nums[s], nums[e]));
//                         s++;
//                         e--;
//                         while(s < e && nums[s] == nums[s-1]) s++;
//                         while(s < e && nums[e] == nums[e+1]) e--;
//                     }
//                     else if(nums[s] + nums[e] >sum){
//                         e--;
//                     }
//                     else{
//                         s++;
//                     }
//                 }
//             }
//         }
//         return arr;
        
    }
}