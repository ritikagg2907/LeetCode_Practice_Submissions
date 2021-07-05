class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0;i<nums.length; i++){
            int id = Math.abs(nums[i]);
            if(nums[id-1]>0){
                nums[id-1] *= -1;
            }
        }
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length ; i++){
            if(nums[i] > 0){
                arr.add(i+1);
            }
        }
        return arr;
    }
}