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
        ListNode temp=head;

        for(int i=1;i<k;i++){
            temp=temp.next;
        }

        ListNode left=head;
        ListNode right=temp;

        while(right.next!=null){
            left=left.next;
            right=right.next;
        }

        int fVal=temp.val;
        temp.val=left.val;
        left.val=fVal;

        return head;
    }
}