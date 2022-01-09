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
    public int pairSum(ListNode head) {
        ListNode cur = head;
        ListNode temp = head;
        int n = 0;
        while(temp != null){
            temp = temp.next;
            n++;
        }
        int arr[] = new int[n/2];
        for(int i =0 ;i < n/2;i++){
            arr[i] = cur.val;
            cur = cur.next;
        }
        int max = 0;
        for(int i = n/2-1 ;i >=0 ; i--){
            max = Math.max(max, cur.val+arr[i]);
            cur = cur.next;
        }
        return max;
    }
}