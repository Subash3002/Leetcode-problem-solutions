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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0)return null;

        return helper(lists,0,lists.length-1);

    }

    ListNode helper(ListNode[] lists,int start,int end){
        if(start==end)return lists[start];
        if(end-start==1){
            return merge(lists[start],lists[end]);
        }
        int mid=start+(end-start)/2;
        ListNode leftPart=helper(lists,start,mid-1);
        ListNode rightPart=helper(lists,mid,end);

        return merge(leftPart,rightPart);
        
    }

    ListNode merge(ListNode list1,ListNode list2){
        ListNode dummy=new ListNode(0);
        ListNode cur=dummy;

        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                cur.next=list1;
                list1=list1.next;
            }else{
                cur.next=list2;
                list2=list2.next;
            }
            cur=cur.next;
        }

        cur.next=(list1!=null)?list1:list2;

        return dummy.next;
    }
}