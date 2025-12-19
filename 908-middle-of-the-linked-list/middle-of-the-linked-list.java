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
        ListNode start1 = head;
        ListNode start2 = head ;
        while(start2 != null && start2.next != null){
            start1 = start1.next;
            start2 = start2.next.next;
        }
        return start1;
    }
}