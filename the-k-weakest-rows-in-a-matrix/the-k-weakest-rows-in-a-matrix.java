class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int i=0;i<mat.length ; i++){
            int c = 0;
            for(int j=0;j<mat[i].length; j++){
                if(mat[i][j] == 1){
                    c++;
                }
            }
            if(!map.containsKey(c)){
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(i);
                map.put(c,arr);
            }
            else{
                ArrayList<Integer> arr = map.get(c);
                arr.add(i);
                map.put(c,arr);
            }
            p.add(c);
        }
        int res[] = new int[k];
        int j=0;
        while(k-->0){
            int top = p.poll();
            ArrayList<Integer> arr = map.get(top);
            res[j++] = arr.remove(0);
            map.put(top, arr);
            // System.out.println(top);
            // ArrayList<Integer> arr = map.get(top);
            // System.out.println(arr);
            // if(k>arr.size()){
            //     for(int i=0;i<Math.min(arr.size() , k) ; i++){
            //         res[j++] = arr.get(i);
            //     }
            //     k -= arr.size();
            // }
            // else{
            //     for(int i=0;i<Math.min(arr.size() , k) ; i++){
            //         res[j++] = arr.get(i);
            //     }
            //     k -= arr.size();
            // }            
        }
        return res;
    }
}