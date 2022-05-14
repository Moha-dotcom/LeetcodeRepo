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
    public ListNode deleteDuplicates(ListNode head) {
        
        
//         // Create Temp Node to save Prev
        
//         ListNode temp = new ListNode(0, head);
//         ListNode prev = temp;
        
        
//         while(head! = null){
//             if(head.next != null && head.val == head.next.val){
//                 // Skip any node that is equal to the Head
                
                
//             }
//         }
        
        
        ListNode cur = head; // we using cur as pointer to iterate
        
        while(cur != null) {
            while(cur.next != null &&   cur.val == cur.next.val){
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        
        return head;
      
        
    }
}