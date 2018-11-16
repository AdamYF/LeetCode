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
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }
}