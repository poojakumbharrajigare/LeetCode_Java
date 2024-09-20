/*
 * Given the head of a linked list, return the list after sorting it in ascending order.
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
    public ListNode sortList(ListNode head) {
        //if the head is null or there's only one element in the list
        if (head == null || head.next == null) 
        {
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null; // Break the link between the two halves

        left = sortList(left);
        right = sortList(right);

        // Merge the two sorted halves
        return merge(left, right);
    }

    private ListNode getMid(ListNode head) 
    {
        ListNode slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) 
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode merge(ListNode left, ListNode right) 
    {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (left != null && right != null) 
        {
            if (left.val < right.val) 
            {
                current.next = left;
                left = left.next;
            } 
            else 
            {
                current.next = right;
                right = right.next;
            }

            current = current.next;
        }

        //Add remaining elements
        if (left != null) 
        {
            current.next = left;
        }

        if (right != null) 
        {
            current.next = right;
        }

        return dummy.next;
    }
}