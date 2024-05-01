/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;
        int lenA=0;
        int lenB=0;
        while(tempA!=null){
            lenA++;
            tempA=tempA.next;
        }
        while(tempB!=null){
            lenB++;
            tempB=tempB.next;
        }
        int diff=Math.abs(lenA-lenB);
        tempA=headA;
        tempB=headB;
        if(lenA>lenB){
            while(diff-- > 0){
                tempA=tempA.next;
                
            }
        }
        else{
             while(diff-- > 0){
                tempB=tempB.next;
                
            }
            
        }
        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;
            if(tempA==null ){
                return null;
            }
        }
        return tempA;
        
        
    }
}