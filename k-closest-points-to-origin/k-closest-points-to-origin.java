class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> p = new PriorityQueue<>((a,b) -> (a[0]*a[0] + a[1]*a[1]) - (b[0]*b[0] + b[1]*b[1]));
        for(int i=0;i<points.length; i++){
            p.add(points[i]);
        }
        int res[][] = new int[k][2];
        for(int i=0; i<k; i++){
            res[i] = p.poll();
        }
        return res;
    }
}