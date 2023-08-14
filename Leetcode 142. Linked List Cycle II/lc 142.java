/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        if(head==null){
            return head;
        }

        if(head.next==null){
            return head.next;
        }
        ListNode f=head;
        ListNode s=head;

        while(f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;

            if(f==s){
                ListNode first=s;
                ListNode second=head;
                
                while(first!=second){
                    first=first.next;
                    second=second.next;
                    
                }
                return second;
            }

        }
        if(f==null){
            return f;
        }else{
            return f.next;
        }

    }
}