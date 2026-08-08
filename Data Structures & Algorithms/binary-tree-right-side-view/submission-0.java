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
    public List<Integer> rightSideView(TreeNode root) {
        Map<Integer, Integer> rsv = new LinkedHashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root != null) q.offer(root);
        int lvl = 0;
        while(!q.isEmpty()){
            int n = q.size();
            for(int i = 0; i < n; i++){
                TreeNode front = q.poll();
                rsv.put(lvl, front.val);
                if(front.left != null) q.offer(front.left);
                if(front.right != null) q.offer(front.right);
            }
            lvl++;
        }   
        return new ArrayList<>(rsv.values());
    }
}
