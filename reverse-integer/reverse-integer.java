class Solution {
    public int reverse(int x) {
        int max = Integer.MAX_VALUE;
        int min= Integer.MIN_VALUE;
        int ans = 0;
        while(x!=0){
            int n = x%10;
            if(ans>max/10 || (ans == max/10 && n>7)) return 0;
            else if(ans < min/10 || (ans == min/10 && n<-8)) return 0;
            ans = ans*10+n;
            x = x/10;
        }
        return ans;
    }
}