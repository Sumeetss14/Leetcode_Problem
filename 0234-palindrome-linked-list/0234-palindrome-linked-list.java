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
    public boolean isPalindrome(ListNode head) {
       ListNode slow=head;
       ListNode fast=head;

       while(fast.next!=null && fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       } 

       ListNode prev=null;
       while(slow!=null){
        ListNode temp=slow.next;
        slow.next=prev;
        prev=slow;
        slow=temp;
       }
       ListNode a=prev;
       while(a!=null){
        System.out.println(a.val);
        a=a.next;
       }

       ListNode first=head;
       ListNode second=prev;

       while(second.next!=null){
        if(first.val!=second.val)return false;
        else{
            first=first.next;
            second=second.next;   
        }
       }
       return true;
    }
}