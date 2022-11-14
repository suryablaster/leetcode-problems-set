/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode A, ListNode B) {
        if(A== null || B==null) return null;
            ListNode p1=A;
            ListNode p2=B;

            while(p1 != p2){
                if(p1== null){
                    p1=B;
                }else{
                    p1=p1.next;
                }

                if(p2== null){
                    p2=A;
                }else{
                    p2=p2.next;
                }
            }
            return p1;
        
    }
}