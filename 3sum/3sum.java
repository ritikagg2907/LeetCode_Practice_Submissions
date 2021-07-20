class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        if(nums.length < 3){
            return arr;
        }
        Arrays.sort(nums);
        for(int i=0; i<nums.length -2; i++){
            if(i == 0 || (i>0 && nums[i] !=nums[i-1])){
                
                int s = i+1;
                int e = nums.length -1;
                int sum = 0-nums[i];
                
                while(s<e){
                    if(nums[s] + nums[e] == sum){
                        arr.add(Arrays.asList(nums[i], nums[s], nums[e]));
                        s++;
                        e--;
                        while(s < e && nums[s] == nums[s-1]) s++;
                        while(s < e && nums[e] == nums[e+1]) e--;
                    }
                    else if(nums[s] + nums[e] >sum){
                        e--;
                    }
                    else{
                        s++;
                    }
                }
            }
        }
        return arr;
        
    }
}