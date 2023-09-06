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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans=new ListNode[k];
        ListNode temp=head;
        int length=0;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        int size=length/k;
        int rem=length%k;
        temp=head;
        ListNode prev=null;

        for(int i=0;temp!=null && i<k;i++,rem--){
            ans[i]=temp;

            for(int j=0;j<size+(rem>0?1:0);j++){
                prev=temp;
                temp=temp.next;
            }

            prev.next=null;
        }
        return ans;
            
    }
}