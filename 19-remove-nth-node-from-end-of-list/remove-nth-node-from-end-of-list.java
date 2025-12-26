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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        temp = head;
        int newCount = 0;
        int index = count - n ;
        if(index == 0){
            head = head.next;
        }
        while(temp != null){
            
            if(newCount == index -1){
                temp.next = temp.next.next;
                break;
            }
            newCount++;
            temp = temp.next;
        }
        return head;
    }
}