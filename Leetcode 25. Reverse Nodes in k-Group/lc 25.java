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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode temp=dummy;
        int count=0;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }

        temp=dummy;

        while(temp.next!=null){
            if(count<k) break;
            ListNode tempNext=temp.next;
            ListNode first=temp.next;
            ListNode second=first.next;
            int nodes=k-1;
            while(nodes-- > 0){
                ListNode next=second.next;
                second.next=first;
                first=second;
                second=next;
            }
            count-=k;
            temp.next=first;
            tempNext.next=second;
            temp=tempNext;
        }
        return dummy.next;
    }
}