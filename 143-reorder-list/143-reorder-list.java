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
    public void reorderList(ListNode head) {
        
       if(head == null){
         return;
           
       }
        
        
        List<ListNode> listofNodes = new ArrayList<>();
        
        ListNode pointer = head;
        while(pointer!= null){
            listofNodes.add(pointer);
            pointer = pointer.next;
        }
        
        
        int indexFirst = 1;
        int indexLast = listofNodes.size()-1;
        ListNode p = head;
        int i = 0;
        
        
        while(indexFirst <= indexLast){
            if(i %2 == 0){
                p.next = listofNodes.get(indexLast--);
                p = p.next;
            }else{
                p.next = listofNodes.get(indexFirst++);
                p = p.next;
            }
            
            i++;
        }
        
        
        p.next = null;
        
    }
}