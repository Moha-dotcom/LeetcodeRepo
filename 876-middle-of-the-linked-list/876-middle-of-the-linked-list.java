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
    public ListNode middleNode(ListNode head) {
        
       ListNode slowPointer = head;
        ListNode fastpointer = head;
        
        
        while(fastpointer != null && fastpointer.next != null){
            slowPointer = slowPointer.next;
            fastpointer = fastpointer.next.next;
        
        }
        
        
        return slowPointer;
        
        
    }
    
    
   
}