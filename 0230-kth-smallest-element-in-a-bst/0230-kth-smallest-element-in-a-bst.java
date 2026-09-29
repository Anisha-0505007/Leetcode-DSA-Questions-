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
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            // Reach the leftmost node of the current node
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            // Pop the current node from the stack
            curr = stack.pop();
            
            // Decrement k; when k becomes 0, we found our element
            k--;
            if (k == 0) {
                return curr.val;
            }

            // Move to the right subtree
            curr = curr.right;
        }

        return -1;
    }
}