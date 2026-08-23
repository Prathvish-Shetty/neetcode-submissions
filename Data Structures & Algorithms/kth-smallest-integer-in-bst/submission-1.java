class Solution {
    int kthSmallestEle = -1, cnt = 0;
    private void inorder(TreeNode root, int k) {
        if(root==null)  return;
        inorder(root.left,k);
        cnt++;
        if(cnt == k){
            kthSmallestEle = root.val;
            return;
        }
        inorder(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return kthSmallestEle;
    }
}