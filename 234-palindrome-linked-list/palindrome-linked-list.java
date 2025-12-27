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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr =temp;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        ListNode fast = head;
        ListNode slow = head;
        if(head == null || head.next == null){return true;}
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rev = reverse(slow);
        while(rev != null ){
            if(temp.val != rev.val){
                return false;
            }
            temp = temp.next;
            rev = rev.next;
        }
        return true;
    }
}