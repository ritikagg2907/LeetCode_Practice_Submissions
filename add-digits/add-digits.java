class Solution {
    public int addDigits(int num) {
        int res = 0;
        if(num==0){
            return 0;
        }
        else{
            res = 1 + (num-1)%9;
        }
        return res;
    }
}