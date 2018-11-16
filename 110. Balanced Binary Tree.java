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
    public boolean isBalanced(TreeNode root) {
        return root == null ? true :
            isBalanced(root.left) && isBalanced(root.right) &&
            differenceOneOrLess(maxDepth(root.left), maxDepth(root.right));
    }

    private static boolean differenceOneOrLess(int x, int y) {
        return Math.abs(x - y) <= 1 ? true : false;
    }

    private static int maxDepth(TreeNode root) {
        return root == null ? 0 : max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }
}