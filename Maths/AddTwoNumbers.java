/*
You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order, and each of their nodes contains a single digit. 
Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1, l2, 0);
    }

    private ListNode add(ListNode next1, ListNode next2, int carry) 
    {
        if (next1 == null && next2 == null && carry == 0) return null;

        int total = (next1 != null ? next1.val : 0) + (next2 != null ? next2.val : 0) + carry;
        carry = total / 10;
        int val = total % 10;

        ListNode next1Next = next1 != null ? next1.next : null;
        ListNode next2Next = next2 != null ? next2.next : null;

        return new ListNode(val, add(next1Next, next2Next, carry));
    }
}