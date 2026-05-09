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
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr != null){
            next = curr.next; // next mei curr ke next ka address dala for preserve the next node address
            curr.next = prev; // curr ka next arrow ghumakar prev ki taraf point kar diya jo null ko point kar raha hai
            prev = curr; // prev ko current ki place pe lekar aaye 
            curr = next; // current ko next ki place pe lekar gaye and then next ko aage kiya agli node pe
        }
        return prev;
    }
}