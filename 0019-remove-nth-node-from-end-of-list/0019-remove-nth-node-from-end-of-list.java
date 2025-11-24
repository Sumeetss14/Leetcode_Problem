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
        // for calculating the size of the list
        ListNode temp1=head;
        int size=0;
        while(temp1!=null){
            size++;
            temp1=temp1.next;
        }

        // Index one less than from the start
        int i=size-n;

        // if there is only one node in the list
        if(i==0)return head.next;

        // this temp node will point after the loop the completion is on the previous element of the target node
        ListNode temp=new ListNode(0);
        temp.next=head;
        int j=0;
        while(j!=i){
         j++;
         temp=temp.next;
        }

        // this will help in removing the target node from the LinkedList
        temp.next=temp.next.next;

        return head;

    }
}