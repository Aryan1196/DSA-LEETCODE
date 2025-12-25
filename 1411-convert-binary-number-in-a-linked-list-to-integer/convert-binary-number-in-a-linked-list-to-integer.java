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
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode next;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public int getDecimalValue(ListNode head) {
        ListNode head1 = reverseList(head);
        int sum = 0;
        int i = 0;
        ListNode temp = head1;
        while(temp != null){
            sum+=temp.val*Math.pow(2,i);
            temp = temp.next;
            i++;
        }
        return sum;
    }
}