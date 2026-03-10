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
    public void reorderList(ListNode head) {
        // ListNode curr = head;
        // while(curr!=null && curr.next!=null){
        //     ListNode temp = curr;
        //     while(temp.next.next!=null){
        //         temp = temp.next;
        //     }
        //     ListNode last = temp.next;
        //     temp.next = null;
        //     last.next = curr.next;
        //     curr.next = last;
        //     curr = last.next;
        ListNode curr = head;
        while(curr!=null && curr.next!=null){
            ListNode temp = curr;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            ListNode last = temp.next;
            temp.next = null;
            last.next = curr.next;
            curr.next = last;
            curr = last.next;
        }
        }

    }
  
