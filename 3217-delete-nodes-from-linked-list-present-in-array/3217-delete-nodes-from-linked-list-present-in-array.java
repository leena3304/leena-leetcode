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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        dummy.next=head;
        while(dummy.next!=null){
            if(hs.contains(dummy.next.val)){
                dummy.next=dummy.next.next;
            }
            else{
                dummy=dummy.next;
            }
        }
        return temp.next;
    }
}