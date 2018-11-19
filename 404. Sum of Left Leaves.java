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
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        sum += root != null ? sumLeaves(root, false) : 0;

        return sum;
    }

    private static int sumLeaves(TreeNode root, boolean isLeft) {
        int sum = 0;

        if (root != null) {
            if (root.left == null && root.right == null) {
                sum += isLeft ? root.val : 0;
            } else if (root.left == null && root.right != null) {
                sum += sumLeaves(root.right, false);
            } else {
                sum += sumLeaves(root.left, true) + sumLeaves(root.right, false);
            }
        }

        return sum;
    }
}