class Solution {
    public boolean fn(TreeNode root, int sum, int targetSum){
        if(root == null) return false;

        // choose
        sum += root.val;

        // check leaf
        if(root.left == null && root.right == null){
            return sum == targetSum;
        }

        // explore
        boolean left = fn(root.left, sum, targetSum);
        boolean right = fn(root.right, sum, targetSum);

        // unchoose (optional here)
        sum -= root.val; // ye actually required nahi hai

        return left || right;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return fn(root, 0, targetSum);
    }
}