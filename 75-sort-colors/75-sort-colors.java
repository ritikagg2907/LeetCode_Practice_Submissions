class Solution {
    public void sortColors(int[] nums) {
        int z = 0;
        int o = 0;
        int t = 0;
        for(int i : nums){
            if(i == 0){
                z++;
            }
            else if(i==1){
                o++;
            }
            else{
                t++;
            }
        }
        int i = 0;
        for(i=0;i<z; i++){
            nums[i] = 0;
        }
        int j = i;
        for(j=i; j < i+o; j++){
            nums[j] = 1;
        }
        for(int k = j; k<nums.length; k++){
            nums[k] = 2;
        }
    }
}