class Solution {
    public int subtractProductAndSum(int n) {
        long p = 1;
        long s = 0;
        while(n>0){
            int num = n%10;
            n = n/10;
            p *= num;
            s += num;
        }
        return (int)(p-s);
    }
    
}