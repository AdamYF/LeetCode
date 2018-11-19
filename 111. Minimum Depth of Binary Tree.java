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
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            if (root.left != null && root.right != null) {
                return min(minDepth(root.left) + 1, minDepth(root.right) + 1);
            } else if (root.left != null && root.right == null) {
                return minDepth(root.left) + 1;
            } else if (root.left == null && root.right != null) {
                return minDepth(root.right) + 1;
            } else {
                return 1;
            }
        }
    }

    private static int min(int a, int b) {
        return a > b ? b : a;
    }
}