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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode sl = head;
        ListNode fa = head;
        
        while(fa != null && fa.next !=null){
            fa = fa.next.next;
            sl = sl.next;
        }
        // System.out.println(fa.val);
        if(fa != null){
            sl = sl.next;
        }
        sl = rev(sl);
        while(sl != null){
            if(head.val != sl.val){
                return false;
            }
            sl = sl.next;
            head = head.next;
        }
        return true;
        
    }
    
    public ListNode rev(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode cur = head.next;
            head.next = prev;
            prev = head;
            head  = cur;
        }
        return prev;
    }
}