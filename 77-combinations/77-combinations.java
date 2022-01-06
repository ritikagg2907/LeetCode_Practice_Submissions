class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        if (k > n || k < 0) {
            return arr;
        }
        subs(arr, new ArrayList<Integer>(), 1, n, k);
        return arr;
    }
    
    public void subs(List<List<Integer>> arr, ArrayList<Integer> temp, int start, int n, int k){
        if(temp.size() == k){
            arr.add(new ArrayList<Integer>(temp));
            return;
        }
        
        for(int i=start;i<=n;i++){
            temp.add(i);
            subs(arr, temp, i+1, n,k);
            temp.remove(temp.size()-1);
        }
    }
}