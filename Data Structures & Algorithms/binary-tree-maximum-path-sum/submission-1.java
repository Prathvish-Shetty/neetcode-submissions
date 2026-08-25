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
    private int sum;
    private int sum(TreeNode root){
        if(root == null) return 0;
        int leftSum = Math.max(0, sum(root.left));
        int rightSum = Math.max(0, sum(root.right));
        sum = Math.max(sum, root.val+leftSum+rightSum);
        return root.val + Math.max(leftSum, rightSum);
    }
    public int maxPathSum(TreeNode root) {
        sum = Integer.MIN_VALUE;
        sum(root);
        return sum;
    }
}
