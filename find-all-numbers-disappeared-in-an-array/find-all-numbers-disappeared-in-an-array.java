class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean arr[] = new boolean[nums.length+1];
        arr[0] = true;
        for(int i : nums){
            arr[i] = true;
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0;i< arr.length;i ++){
            if(!arr[i]){
                res.add(i);
            }
        }
        return res;
    }
}