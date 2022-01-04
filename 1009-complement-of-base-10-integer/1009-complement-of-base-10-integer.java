class Solution {
    public int bitwiseComplement(int n) {
        int digit = 0;
        if(n==0){
            return 1;
        }
        if(n==Integer.MAX_VALUE){
            return 0;
        }
        int temp = n;
        while(temp>0){
            digit++;
            temp /= 2;
        }
        double t = Math.pow(2,digit) -1;
        return (int)t ^ n;
    }
}