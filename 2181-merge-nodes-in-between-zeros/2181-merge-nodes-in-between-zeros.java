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
    public ListNode mergeNodes(ListNode head) {
       
        ListNode curr = head; 
        ListNode temp = head.next; // 3
        int s = 0;
      
        while(temp.next != null){
            if(temp.next.val == 0){
                s = s+temp.val;
                curr.next = temp;
                curr.next.val = s;
                curr = curr.next;
                s = 0;
            }else{
                s = s+temp.val;
            }
            
           temp = temp.next;
            
            
        }
        
         curr.next = null;
         return head.next;
        
    }
}