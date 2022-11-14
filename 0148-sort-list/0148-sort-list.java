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
    public ListNode sortList(ListNode head) {
        
    if (head == null || head.next == null) return head;

    ListNode fast = head,
    slow = head,
    temp = null;

    while (fast != null && fast.next != null) {
      temp = slow;
      slow = slow.next;
      fast = fast.next.next;
    }
    temp.next = null;
    ListNode temp1 = sortList(head);
    ListNode temp2 = sortList(slow);
    ListNode sorted = mergeTwoLists(temp1, temp2);
    return sorted;
    }
     private ListNode mergeTwoLists(ListNode temp1, ListNode temp2) {
    ListNode dummy = new ListNode( - 1);
    ListNode current = dummy;
    while (temp1 != null && temp2 != null) {
      if (temp1.val < temp2.val) {
        current.next = temp1;
        temp1 = temp1.next;
        current = current.next;
      } else {
        current.next = temp2;
        temp2 = temp2.next;
        current = current.next;
      }
    }
    if (temp1 != null) {
      current.next = temp1;
    } else {
      current.next = temp2;
    }
    return dummy.next;
  }
}