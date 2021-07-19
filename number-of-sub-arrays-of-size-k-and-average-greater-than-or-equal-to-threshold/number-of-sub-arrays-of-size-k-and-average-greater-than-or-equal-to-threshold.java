class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
        Queue<Integer> q = new LinkedList<>();
        int i =0;
        int avr = 0;
        for(i=0;i<k;i++){
            q.add(arr[i]);
            avr += arr[i];
        }
        int res = 0;
        for(i=k; i <arr.length ; i++){
            if(avr/k >= t){
                res++;
            }
            avr -= q.remove();
            q.add(arr[i]);
            avr += arr[i];
        }
        if(avr/k >= t){
            res++;
        }
        return res;
    }
}