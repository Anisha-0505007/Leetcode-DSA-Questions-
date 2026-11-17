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
    public TreeNode deleteNode(TreeNode A, int B) {
         if (A == null){
            return A;
        }
        if(B < A.val) {A.left = deleteNode(A.left,B);}
        else if(B > A.val) {A.right = deleteNode(A.right,B);}
        else{
            if(A.right == null && A.left == null){
                return null;
            }
            else if(A.left == null || A.right == null){
                return (A.left != null ? A.left : A.right);
            }
            else{
                TreeNode temp = A.left;
                while(temp.right != null){
                    temp = temp.right;
                }
                A.val = temp.val;
                A.left = deleteNode(A.left, temp.val);
            }
        }
        return A;
    }
}