class Solution {
       static int height(TreeNode root){
        if(root==null) return 0;
        return  1 + Math.max(height(root.left) , height(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int left = height(root.left);
        int right = height(root.right);
        int d = left-right;
        if(d<0) d = -1*d;
        if(d>1) return false;
        return (isBalanced(root.left) && isBalanced(root.right));
    }
}