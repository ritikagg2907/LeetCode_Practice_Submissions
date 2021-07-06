class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i:stones){
            arr.add(i);
        }
        Collections.sort(arr);
        
        while(arr.size()>1){
            Collections.sort(arr);
            //System.out.println(arr.size());
            int l = arr.get(arr.size()-1);
            int sl = arr.get(arr.size()-2);
            // for(int i : arr){
            //     System.out.print(i+ " " );
            // }
            // System.out.println();
            if(l == sl){
                arr.remove(arr.size()-2);
                arr.remove(arr.size()-1);
                if(arr.size() == 0){
                    arr.add(0);
                }
            }
            else{
                arr.remove(arr.size()-2);
                arr.remove(arr.size()-1);
                arr.add(l-sl);
            }
        }
        return arr.get(0);
    }
}