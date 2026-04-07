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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null&&list2==null)return null;
        if(list1==null&&list2!=null)return list2;
        if(list1!=null&&list2==null)return list1;
        ListNode head = new ListNode(10000);
        ListNode temp=head;
        ListNode t1 = list1;
        ListNode t2 = list2;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                ListNode Tsum = new ListNode(t1.val);
                temp.next = Tsum;
                temp=temp.next;
                t1 = t1.next;
            }
            else{
                ListNode Tsum = new ListNode(t2.val);
                temp.next = Tsum;
                temp=temp.next;
                t2 = t2.next;
            }
        }
        
        if(t1==null){
            temp.next=t2;
        }
        if(t2==null){
            temp.next=t1;
        }
        return head.next;
    }
}