/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> t = new ArrayList<>();
        while(head != null){
            t.add(head.val);
            head = head.next;
        }
        int arr[] = new int[t.size()];
        for (int i = 0; i < t.size(); i++) {
            arr[i] = t.get(i);
        }
        int r[] = ri(arr);
        return r;
    }
    
    public int[] ri(int arr[]){
        int n = arr.length;
        int r[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1 ;i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            r[i] = st.isEmpty() ? 0 : st.peek();
            st.push(arr[i]);
        }
        return r;
    }
}