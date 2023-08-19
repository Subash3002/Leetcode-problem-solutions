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
        ListNode dummy=new ListNode(0);
        ListNode l3=dummy;

        int carry=0;
        while(l1!= null || l2!=null){
            int s1=0;
            int s2=0;
            if(l1!=null){
                s1=l1.val;
            }
            if(l2!=null){
                s2=l2.val;
            }
            int cur_sum=s1+s2+carry;
            carry=cur_sum/10;
            int sum=cur_sum%10;

            ListNode newnode=new ListNode(sum);
            l3.next=newnode;

            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
            l3=l3.next;
        }
        if(carry>0){
            ListNode newnode =new ListNode(carry);
            l3.next=newnode;
        }
        return dummy.next;
    }
}