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
    private void preOrder(TreeNode root, List<Integer> al, int k){
        if(root == null || al.size() == k) return;
        preOrder(root.left, al, k);
        al.add(root.val);
        preOrder(root.right, al, k);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> al = new ArrayList<>();
        preOrder(root, al, k);
        return al.get(k-1);
    }
}
