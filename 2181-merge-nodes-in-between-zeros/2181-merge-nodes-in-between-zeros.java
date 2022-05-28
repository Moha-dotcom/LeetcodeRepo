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
        ListNode node = head.next.next;
        ListNode start = head.next;
        ListNode ref = start;
        
        while (node != null) {
            if (node.val == 0) {
                ref.next = node.next;
                ref = ref.next;
                node = node.next;
            }
            else {
                ref.val += node.val;
            }
            
            if (node != null) {
                node = node.next;
            }
        }
        
        return start;
    }
}