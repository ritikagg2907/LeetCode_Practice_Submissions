class Solution {
    public int maxDistToClosest(int[] seats) {
        int min = 0;
        for(int i=0;i<seats.length; i++){
            if(seats[i] == 1){
                continue;
            }
            int curmin = Integer.MAX_VALUE;
            for(int j=0;j<seats.length; j++){
                if(seats[j] == 1){
                    int diff = Math.abs(j-i);
                    curmin = Math.min(curmin, diff);
                }
            }
            min = Math.max(min, curmin);
        }
        return min;
    }
}