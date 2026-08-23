class Solution {
    private int dfs(TreeNode root, int maxSoFar) {
        if (root == null) return 0;

        int good = root.val >= maxSoFar ? 1 : 0;
        maxSoFar = Math.max(maxSoFar, root.val);

        return good
            + dfs(root.left, maxSoFar)
            + dfs(root.right, maxSoFar);
    }

    public int goodNodes(TreeNode root) {
        return dfs(root, -100);
    }
}