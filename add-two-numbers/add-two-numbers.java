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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode(0);
        ListNode res = dum;
        int c = 0;
        while(l1 != null || l2 != null){
            int f = l1 != null ? l1.val : 0;
            int s = l2 != null ? l2.val : 0;
            int sum = f+s+c;
            c = sum/10;
            sum = sum%10;
            ListNode n = new ListNode(sum);
            res.next = n;
            res = n;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if(c>0){
            ListNode n = new ListNode(c);
            res.next = n;
            res = res.next;
        }
        return dum.next;
    }
}