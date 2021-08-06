class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        int count = 0;
        int n = matrix.length;
        for(int i =0; i<n;i++){
            for(int j=0;j<n;j++){
                if(p.size() < k){
                    p.add(matrix[i][j]);
                }
                else{
                    if(p.peek() > matrix[i][j]){
                        p.poll();
                        p.add(matrix[i][j]);
                    } 
                }
            }
        }
        return p.peek();
    }
}