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
    public int maxPathSum(TreeNode root) {
        int maxpath[] = new int[1];
        maxpath[0] = Integer.MIN_VALUE;
        pathsum(root,maxpath);
        return maxpath[0];
    }

    public int pathsum(TreeNode root , int[] maxpath){
        if (root == null){
            return 0;
        }
        int lp = Math.max(0,pathsum(root.left, maxpath));
        int rp = Math.max(0,pathsum(root.right, maxpath));
        maxpath[0] = Math.max(maxpath[0],lp+rp+root.val);

        return root.val+Math.max(lp,rp);
    }
}