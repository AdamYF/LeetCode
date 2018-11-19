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
    public boolean hasPathSum(TreeNode root, int sum) {
        int depth = 0;
        return tryPathSum(root, sum, depth);
    }

    private static boolean tryPathSum(TreeNode root, int sum, int depth) {
        if (root == null && sum == 0) {
            return depth == 0 ? false : true;
        } else if (root == null && sum != 0) {
            return false;
        } else {
            if (root.left != null && root.right != null) {
                return tryPathSum(root.left, sum - root.val, depth + 1) || tryPathSum(root.right, sum - root.val, depth + 1);
            } else if (root.left != null && root.right == null) {
                return tryPathSum(root.left, sum - root.val, depth + 1);
            } else {
                return tryPathSum(root.right, sum - root.val, depth + 1);
            }
        }
    }
}