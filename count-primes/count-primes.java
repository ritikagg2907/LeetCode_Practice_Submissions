class Solution {
    public int countPrimes(int n) {
        if(n==0){
            return 0;
        }
        boolean arr[] = pr(n);
        int res = 0;
        for(int i=0;i<arr.length; i++){
            // System.out.println(i + " " + arr[i]);
            if(arr[i]){
                res++;
            }
        }
        return res;
    }
    
    public boolean[] pr(int n){
        boolean[] arr = new boolean[n+1];
        arr[0] = false;
        arr[1] = false;
        for(int i=2;i<n;i++){
            arr[i] = true;
        }
        for(int i=2;i*i< n;i++){
            if(!arr[i]){
                continue;
            }
            for(int j = i*i ;j<n;j+=i){;
                if(arr[j]){
                    arr[j] = false;
                }
            }
        }
        return arr;
    }
}