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
    private void revPreOrder(TreeNode root, int level, List<Integer> rsv){
        if(root == null) return;
        if(rsv.size() == level) rsv.add(root.val);
        revPreOrder(root.right, level+1, rsv);
        revPreOrder(root.left, level+1, rsv);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rsv = new ArrayList<>();
        revPreOrder(root, 0, rsv); // root right left
        return rsv;
    }
}
