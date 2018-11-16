/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root == null ? true : branchSymmetric(root.left, root.right);
    }
    
    private static boolean branchSymmetric(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p != null && q != null && p.val == q.val) {
            return branchSymmetric(p.left, q.right) && branchSymmetric(p.right, q.left);
        } else {
            return false;
        }
    }
}