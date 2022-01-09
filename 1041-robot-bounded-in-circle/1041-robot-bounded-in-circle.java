class Solution {
    public boolean isRobotBounded(String s) {
        int dir[][] = {{0,1}, {-1, 0}, {0, -1}, {1,0}};
        int i = 0;
        int x = 0;
        int y = 0;
        
        for(int j = 0 ; j < s.length(); j++){
            if(s.charAt(j) == 'L'){
                i = (i+1)%4;
            }
            else if(s.charAt(j) == 'R'){
                i = (i+3)%4;
            }
            else{
                x += dir[i][0];
                y += dir[i][1];
            }
        }
        
        return x == 0 && y == 0 || i != 0;
    }
}