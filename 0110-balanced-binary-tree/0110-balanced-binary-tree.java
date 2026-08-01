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
    public boolean isBalanced(TreeNode root) {
        boolean arr[] = new boolean[1];
        arr[0] = true;
        height(root,arr);
        return arr[0];
    }
    public int height(TreeNode root, boolean[] arr){
        if (root == null){
            return -1;
        }
        int lh = height(root.left,arr);
        int rh = height(root.right,arr);

        if (Math.abs(lh-rh)>1){
            arr[0] = false;
        }

        return Math.max(lh,rh)+1;
    }
}