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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
       if(fast!=null){
           slow=slow.next;//mid
       }
       // ListNode temp=mid.next;
        //mid.next=null;
     // ListNode mid=slow.next;
      //  slow.next=null;
        
        ListNode revhead=reverse(slow);
        while(revhead!=null){
            if(revhead.val!=head.val){
                return false;
            }
            else{
                revhead=revhead.next;
                head=head.next;
            }
        }
        return true;
        
        
    }
    public ListNode reverse(ListNode head){
      // ListNode dummy=new ListNode(0);
        ListNode prev=null;
       // ListNode cur=head;
        while(head!=null){
            ListNode next_node=head.next;
            head.next=prev;
            prev=head;
            head=next_node;     
        }
        return prev;
    }
}