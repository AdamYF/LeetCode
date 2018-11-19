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
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode temp = null;
            if (root.left != null && root.right != null) {
                temp = root.left;
                root.left = root.right;
                root.right = temp;
                root.left = invertTree(root.left);
                root.right = invertTree(root.right);
            } else if (root.left != null && root.right == null) {
                root.right = root.left;
                root.left = null;
                root.right = invertTree(root.right);
            } else if (root.left == null && root.right != null) {
                root.left = root.right;
                root.right = null;
                root.left = invertTree(root.left);
            }
        }

        return root;
    }
}