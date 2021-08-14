class Solution {
    public int[] asteroidCollision(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0 ; i < n; i++){
            int val = arr[i];
            if(val > 0){
                st.push(val);
            }
            else{
                while(!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(val)){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek() == Math.abs(val)){
                    st.pop();
                    continue;
                }
                if(!st.isEmpty() && st.peek() > Math.abs(val)){
                    continue;
                }
                st.push(val);
            }
            // else if(st.isEmpty() && val < 0){
            //     st.push(val);
            // }
            // else if(val < 0 ){
            //     while(!st.isEmpty() && st.peek() <= Math.abs(val)){
            //         st.pop();
            //     }
            // }
        }
        int ar[] = new int[st.size()];
        int i =st.size() -1;
        while(st.size()>0){
            ar[i--] = st.pop();
        }
        return ar;
    }
}