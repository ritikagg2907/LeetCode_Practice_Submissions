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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode h = head;
        ListNode fast = head;
        ListNode f = head;
        for(int i=0; i<k-1; i++){
            f = f.next;
            fast = fast.next;
        }
        ListNode slow = head;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        int temp = f.val;
        f.val = slow.val;
        slow.val = temp;
        return h;
    }
}