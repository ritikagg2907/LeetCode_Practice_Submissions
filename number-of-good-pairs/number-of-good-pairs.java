class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
           if(!map.containsKey(nums[i])){
               map.put(nums[i] , 1);
           }
            else{
                int a = map.get(nums[i]);
                a++;
                map.put(nums[i] ,a);
            }
        }
        int res = 0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            int n = e.getValue();
            if(n>1){
                res += n * (n-1)/2;
            }
        }
        // System.out.println(map);
        return res;
    }
}