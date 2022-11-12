/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
         if(head==null) return null;
         ListNode s=head;
        ListNode f = head;
        boolean check = false;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                check=true;
                break;
            }
        }
        
        
        if(check == false){
            return null;
        }else{
            ListNode s1=head;
            ListNode s2=s;
            while(s1 != s2){
                s1=s1.next;
                s2=s2.next;
            }
            return s1;
        }
    }
}