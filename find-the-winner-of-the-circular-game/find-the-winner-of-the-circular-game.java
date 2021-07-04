class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i <= n; i++){
            arr.add(i);
        }
        int cur = 0;
        while(arr.size() != 1){
            cur = (cur + k-1)%arr.size();
            arr.remove(cur);
        }
        return arr.get(0);
    }
}