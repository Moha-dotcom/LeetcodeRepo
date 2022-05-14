/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        // One Approach i can take is 
        // Store every element in the LinkedList until head != null
        // We check if head contains in the set return true, // If the loop finishes            without encountering any duplicate then we return true
        // if it doesn't we add the element to the set and move to the next node and            then return false
        if(head == null) return false; //Check point 1
        ListNode slow =  head; // moves one point
        ListNode fast = head.next;  // moves two points

        while (slow != fast){
            slow = slow.next;
            if(fast != null && fast.next != null){
                fast = fast.next.next;
                
            }else {
                return false;
            }
        }
        
        return true;
    }
}