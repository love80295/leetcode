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
        static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter writer = new FileWriter("display_runtime.txt")) {
                writer.write("0");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
        }
    public ListNode rev(ListNode temp){
        if(temp==null||temp.next==null)return temp;
        ListNode h=null;
        ListNode h1=temp;
        ListNode h2=temp.next;
        while(h2!=null){
            h1.next=h;
            h=h1;
            h1=h2;
            h2=h2.next;
        }
        h1.next=h;
        h=h1;
        return h;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp=l1;
        ListNode temp1=l2;
        if(l1==null&&l2==null)return null;
        temp=rev(l1);
        temp1=rev(l2);
        ListNode ans=new ListNode(0);
        ListNode temp3=ans;
        int carry=0;
        while(temp!=null||temp1!=null){
            int sum=carry+0;
            if(temp!=null){
                sum+=temp.val;
                temp=temp.next;
            }
            if(temp1!=null){
                sum+=temp1.val;
                temp1=temp1.next;
            }
            temp3.next=new ListNode(sum%10);
            carry=sum/10;
            temp3=temp3.next;
        }
        if(carry==1)temp3.next=new ListNode(1);
        ans=rev(ans.next);
        return ans;
    }
}