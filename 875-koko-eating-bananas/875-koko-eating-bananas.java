class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int max = 0;
        for(int i : piles){
            max = Math.max(max, i);
        }
        int right = max;
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(canEatInTime(piles, mid, h)) right = mid - 1;
            else left = mid + 1;
        }
        return left;
    }
    public boolean canEatInTime(int piles[], int k, int h){
        int hours = 0;
        for(int pile : piles){
            int div = pile / k;
            hours += div;
            if(pile % k != 0) hours++;
        }
        return hours <= h;
    }
}