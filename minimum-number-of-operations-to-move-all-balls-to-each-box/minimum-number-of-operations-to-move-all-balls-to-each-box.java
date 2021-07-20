class Solution {
    public int[] minOperations(String boxes) {
        int arr[] = new int[boxes .length()];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<boxes.length(); i++){
            char c = boxes.charAt(i);
            if(c == '1'){
                map.put(i,1);
            }
        }
        if(map.size() == 0){
            return arr;
        }
        for(int i=0;i<boxes.length(); i++){
            Set<Integer> temp = map.keySet();
            int res = 0;
            for(int j: temp){
                res += Math.abs(i-j);
            }
            arr[i] = res;
        }
        return arr;
        
    }
}