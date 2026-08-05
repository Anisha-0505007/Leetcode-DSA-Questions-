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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> imap = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            imap.put(inorder[i],i);
        }
        TreeNode root = build(preorder,0,preorder.length-1,inorder,0,inorder.length-1,imap);
        return root;
    }

    public TreeNode build(int[] preorder, int preStart , int preEnd , int[] inorder , int inStart, int inEnd , Map<Integer,Integer> imap){
        if (preStart>preEnd || inStart > inEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int inroot = imap.get(root.val);
        int numsleft = inroot - inStart;

        root.left = build(preorder,preStart+1,preStart+numsleft,inorder,inStart, inroot-1,imap);
        root.right = build(preorder,preStart+numsleft+1,preEnd, inorder, inroot+1,inEnd,imap);

        return root;

    }
}