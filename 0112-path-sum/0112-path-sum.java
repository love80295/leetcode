class Solution {
    public boolean fun(TreeNode root,int sum){
        if(root==null)return false;
        if(root.left==null&&root.right==null){
            if(sum==root.val)return true;
            else return false;
        }
        return fun(root.left,sum-root.val)||fun(root.right,sum-root.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
       if(root==null)return false;
       return fun(root,targetSum);
    }
}