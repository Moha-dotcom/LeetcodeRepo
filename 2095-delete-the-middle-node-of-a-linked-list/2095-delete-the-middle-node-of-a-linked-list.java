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
    public ListNode deleteMiddle(ListNode head) {
        
        // Solution 2
       if(head.next == null) {
            return null;
        }
        
        ListNode slow =head;
        ListNode fast = head;
        ListNode prev = head;
        
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        prev.next = slow.next;
        slow.next = null;
        
        return head;
        
    }
}


    
    
    // Solution 1
//      int length = 0; 
//         ListNode temp = head;
//         ListNode slow = head;
//         while(temp!= null){
//             length++;
//             temp = temp.next;
//         }  
//         int middle = length / 2 - 1; 
//         for(int i = 0; i < middle; i++){
//             slow  = slow.next;
//         }
    
//         if(slow.next == null){
//             return null;
//         }else{
//             slow.next = slow.next.next;
//         }
        
        
//         return head;
//     }