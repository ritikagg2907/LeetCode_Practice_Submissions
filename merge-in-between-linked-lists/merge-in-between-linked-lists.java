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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode h = list1;
        
        for(int i=1;i<a;i++){
            list1 = list1.next;
        }
        ListNode te = list1;
        for(int i=a;i<=b;i++){
            te = te.next;
        }
        
        list1.next = list2;
        while(list2.next != null){
            list2 = list2.next;
        }
        list2.next = te.next;
        return h;
    }
}