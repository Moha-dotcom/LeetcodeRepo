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
     
        
        int length = 0; 
        ListNode temp = head;
        
        while(temp != null){
            temp = temp.next;
            length++;
        }
        
        // Construct an new Array with half the List
        int newArr [] = new int[length/2];
        int i = 0;
        temp = head;
        
        // Store half of the List in the newArr
        while(i < length/2){
            newArr[i] = temp.val;
            temp = temp.next;
            i++;
        }
         //if odd number of elements, no need to compare the middle element
        if(length % 2 != 0) temp = temp.next;
        i--;
        
          //compare the second half of list element by element
        
        while(temp != null){
            if(newArr[i] != temp.val) return false;
            temp = temp.next;
            i--;
        }
        
        return true;
        
        
    }
}



    