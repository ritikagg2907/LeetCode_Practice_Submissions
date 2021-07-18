class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int r[] = getadd(nums2);
        // for(int i : r){
        //     System.out.print(i + " ");
        // }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums2.length ; i++){
            map.put(nums2[i] , i);
        }
        int res[] = new int[nums1.length];
        for(int i=0;i<nums1.length ; i++){
            int id = map.get(nums1[i]);
            int idx = r[id];
            if(idx==-1){
                res[i] = idx;
            }
            else{
                res[i] = nums2[idx];
            }
        }
        return res;
    }
    
    public int[] getadd(int arr[]){
        int n = arr.length;
        int r[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                st.pop();
            }
            r[i] = st.isEmpty() ?  -1 : st.peek();
            st.push(i);
        }
        return r;
     }
}