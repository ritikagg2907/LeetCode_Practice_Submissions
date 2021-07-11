class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pr = 0;
        boolean z = false;
        int zcount = 0;
        for(int i:nums){
            if(i == 0){
                z = true;
                zcount++;
            }
            else if(i != 0){
                if(pr==0) pr = 1;
                pr *= i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(zcount == 1 && nums[i] != 0){
                nums[i] = 0;
            }
            else if(zcount==1 && nums[i] ==0){
                nums[i] = pr;
            }
            else if(zcount>1){
                nums[i] = 0;
            }
            else{
                nums[i] = pr/nums[i];
            }
        }
        return nums;
    }
}