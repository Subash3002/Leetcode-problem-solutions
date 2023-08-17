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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode prev=dummy;
        
        while(prev.next!=null){
            ListNode first=prev.next;
            if(first.next==null) break;
            ListNode second=first.next;
            ListNode next=second.next;
            second.next=first;
            first.next=next;
            prev.next=second;
            prev=first;
            
        }
        return dummy.next;

    }
}