class Solution {
    public int maxDistToClosest(int[] seats) {
        int k = 0;
        int ans = 0;
        for(int i=0; i < seats.length; i++){
            if(seats[i] == 1){
                k = 0;
            }
            else{
                k++;
                ans = Math.max(ans, (k+1)/2);
            }
        }
        for(int i=0; i<seats.length; i++){
            if(seats[i] == 1){
                ans = Math.max(ans, i);
                break;
            }
        }
        for(int i=seats.length-1; i>=0 ; i--){
            if(seats[i] == 1){
                ans = Math.max(ans, seats.length - 1 - i);
                break;
            }
        }
        return ans;
    }
}