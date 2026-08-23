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
    private int dfs(TreeNode root, int min){
        if(root == null) return 0;
        int cnt = 0;
        if(root.val >= min){
            cnt++;
            min = root.val;
        }
        cnt += dfs(root.left, min);
        cnt += dfs(root.right, min);
        return cnt;
    }
    public int goodNodes(TreeNode root) {
        return dfs(root, -101);
    }
}
