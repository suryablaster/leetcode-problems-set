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
    public ListNode removeNthFromEnd(ListNode head, int B) {
         if(head == null || head.next==null) return null;
        //if(B>=size(head)) return head.next;
        ListNode dummy= new ListNode(-1);
        dummy.next=head;
        ListNode runner = dummy;

        for(int i=0;i<B;i++){
            runner = runner.next;
        }
        ListNode follower = dummy;

        while(runner.next != null){
            runner=runner.next;
            follower=follower.next;
        }
        follower.next=follower.next.next;

        return dummy.next;
    }
}