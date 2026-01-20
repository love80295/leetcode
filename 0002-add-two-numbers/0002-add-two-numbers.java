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
    // public static ListNode rev(ListNode head){
    //     if(head==null || head.next==null) return head;
    //     ListNode newhead = rev(head.next);
    //     head.next.next = head;
    //     head.next = null;
    //     return newhead;
    // }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newnode = new ListNode(100);
        ListNode newtemp = newnode;
        ListNode newrev1 = l1;
        ListNode newrev2 = l2;
        ListNode temp1 = newrev1;
        ListNode temp2 = newrev2;
        int carry = 0;
        while(newrev1!=null || newrev2!=null || carry!=0){
            int sum = carry;
            if(newrev1!=null){
                sum = sum + newrev1.val;
                newrev1 = newrev1.next;
            }
            if(newrev2!=null){
                sum = sum+newrev2.val;
             newrev2 = newrev2.next;
            }
            carry = sum/10;
            int digit = sum%10;
            newtemp.next  = new ListNode(digit);
            newtemp = newtemp.next; 
               
        }
     return newnode.next;
    }
}