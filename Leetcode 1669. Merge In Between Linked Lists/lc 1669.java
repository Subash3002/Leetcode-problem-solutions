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
        ListNode temp=list1;
        ListNode st=list1;
        ListNode ed=list1;
        int itr=0;
        while(temp!=null && itr<=b){
            if(itr==a-1){
                st=temp;
            }
            if(itr==b){
                ed=temp;
            }
            itr++;
            temp=temp.next;
        }
        st.next=list2;
        ListNode tmp=list2;
        while(tmp.next!=null){
            tmp=tmp.next;
        }

        tmp.next=ed.next;
        return list1;
        

    }
}