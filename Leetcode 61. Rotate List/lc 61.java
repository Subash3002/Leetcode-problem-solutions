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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(k<=0 || head==null || head.next==null) return head;
        ListNode tail=head;
        int length=1;
        while(tail.next!=null){
            tail=tail.next;
            length++;
        }

        tail.next=head;

        int rotate=k%length;
        ListNode newLast=head;
        for(int i=0;i<length-rotate-1;i++){
            newLast=newLast.next;
        }
        head=newLast.next;
        newLast.next=null;

        return head;
    }
}