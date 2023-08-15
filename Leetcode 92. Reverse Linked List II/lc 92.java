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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(left==right){
            return head;
        }
        ListNode start=null;
        ListNode end=head;
        for(int i=0;i<left-1;i++){
            start=end;
            end=end.next;
        }
        

        ListNode prev=start;
        ListNode pres=end;
        ListNode next=pres.next;

        for(int i=0;pres!=null && i<right-left+1;i++){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null){
                next=next.next;
            }    
        }
        if(start==null){
            head=prev;
        }else{
            start.next=prev;
        }
        
        end.next=pres;

        return head;
        

    }

   


}