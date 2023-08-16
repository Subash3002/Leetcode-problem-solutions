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
        ListNode mid=mid(head);
        ListNode start=head;
        while(start!=null && mid!=null){
            if(start.val!=mid.val){
                return false;
            }
            start=start.next;
            mid=mid.next;
        }
        return true;
    }

    ListNode reverse(ListNode head){
        if(head==null){
            return head;
        }

        ListNode prev=null;
        ListNode pres=head;
        ListNode next=pres.next;

        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null){
                next=next.next;
            }
            
        }
        return prev;
    }

    ListNode mid(ListNode head){

        if(head==null){
            return reverse(head);
            
        }
        ListNode f=head;
        ListNode s=head;

        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return reverse(s);
    }
}