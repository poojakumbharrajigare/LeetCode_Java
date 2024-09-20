/*
 You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
 */

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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) 
        {
            return null;
        }

        if (l1 == null || l2 == null) 
        {
            return (l1 == null) ? l2 : l1;
        }

        ListNode head;
        if (l1.val < l2.val) 
        {
            head = new ListNode(l1.val);
            l1 = l1.next;
        } 
        else 
        {
            head = new ListNode(l2.val);
            l2 = l2.next;
        }

        ListNode current = head;

        while (l1 != null || l2 != null) 
        {
            if (l1 == null) 
            {
                current.next = l2;
                return head;
            }

            if (l2 == null) 
            {
                current.next = l1;
                return head;
            }

            if (l1.val < l2.val) 
            {
                current.next = new ListNode(l1.val);
                current = current.next;
                l1 = l1.next;
            } 
            else 
            {
                current.next = new ListNode(l2.val);
                current = current.next;
                l2 = l2.next;
            }
        }

        return head;
    }
}