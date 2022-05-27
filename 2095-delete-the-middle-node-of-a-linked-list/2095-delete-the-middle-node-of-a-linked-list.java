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
        
         ListNode slow = head, fast = head;
        while(fast.next!=null) {
            fast = fast.next;
            slow = slow.next;
            if(fast.next==null) break;
            fast = fast.next;
        }
        fast = head;
        if(fast==slow) return null; //special case for single element in linked list
        while(fast.next!=slow) fast = fast.next;
        fast.next = slow.next;
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