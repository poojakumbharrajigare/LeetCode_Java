/*
Given the head of a singly linked list where elements are sorted in ascending order, convert it to a 
height-balanced binary search tree.
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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) 
        {
            return null;
        }

        return toBST(head, null);
    }

    private TreeNode toBST(ListNode head, ListNode tail) {
        if (head == tail) 
        {
            return null;
        }

        ListNode mid = findMid(head, tail);
        TreeNode node = new TreeNode(mid.val);
        node.left = toBST(head, mid);
        node.right = toBST(mid.next, tail);

        return node;
    }

    private ListNode findMid(ListNode head, ListNode tail)
    {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != tail && fast.next != tail) 
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}