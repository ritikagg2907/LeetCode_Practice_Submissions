class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int arr[] = new int[n];
        int l[] = new int[n];
        int r[] = new int[n];
        char ch[] = boxes.toCharArray();
        int count = ch[0]  - '0';
        l[0] = 0;
        for(int i=1; i<n; i++){
            l[i] = l[i-1] + count;
            count += ch[i] - '0';
        }
        
        r[n-1] = 0;
        count = ch[n-1] - '0';
        
        for(int i=n-2; i>=0; i--){
            r[i] = r[i+1] + count;
            count += ch[i] - '0';
        }
        
        
        for(int i=0;i<n;i++){
            arr[i] = l[i] + r[i];
        }
        return arr;
    }
}