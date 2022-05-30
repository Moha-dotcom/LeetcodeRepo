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
    public ListNode rotateRight(ListNode head, int k) {
        
        ListNode temp = head, last;
        int count = 0; 
        
        if(head ==null || head.next == null || k ==0){
            return head;
        }
        
        while(temp != null){
            count++;
            temp = temp.next;
            
        }
        
        temp =head;
        
        k = k % count;
        for(int i =1; i<= k; i++){
            temp = head;
            while(temp.next.next != null)
                temp = temp.next;
            last = temp.next;
            temp.next = null;
            last.next = head;
            head = last;
            
        }
        
        return head;
        
    }
} 

