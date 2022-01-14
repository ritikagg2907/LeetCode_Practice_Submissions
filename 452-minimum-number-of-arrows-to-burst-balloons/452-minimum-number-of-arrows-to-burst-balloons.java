class Solution {
    public int findMinArrowShots(int[][] nums) {
        
        Arrays.sort(nums, (a, b) -> Integer.compare(a[1], b[1]));
        int e = nums[0][1];
        int res = 1;
        for(int arr[] : nums){
            if(arr[0] > e){
                res++;
                e = arr[1];
            }
        }
        return res;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//         if (points == null || points.length == 0) return 0;
//         Arrays.sort(points, (int[] p1, int[] p2)->{
// 		    // Don't use p1[1 ] - p2[1]. It may overflow 
//             return p1[1] < p2[1] ? -1 : 1; 
//         });
//         int end = points[0][1];
		
// 		// the reason res = 1 is that we need an arrow to destroy the last group. 
//         int res = 1;
//         for (int[] point: points)
//         {
//             if (point[0] <= end) continue;
//             res++;
//             end = point[1];
//         }
//         return res;
    }
}