class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        Deque<Integer> ar = new LinkedList<>();
        int i=0;
        for(i=0;i<k;i++){
            while(!ar.isEmpty() && arr[ar.getLast()] < arr[i]){
                ar.removeLast();
            }
            ar.addLast(i);
        }
        int res[] = new int[arr.length - k+1];
        int j = 0;
        for(i =k;i<arr.length ; i++){
            res[j++] = arr[ar.getFirst()];
            if(ar.getFirst() < i-k+1){
                ar.removeFirst();
            }
            while(!ar.isEmpty() && arr[ar.getLast()] < arr[i]){
                ar.removeLast();
            }
            ar.addLast(i);
        }
        res[j] = arr[ar.getFirst()];
        return res;
    }
}