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
    public boolean fn(TreeNode root , int targetSum , int sum){
       if(root!=null)  sum+=root.val;
        if(root==null) return false;
         if(root.left==null && root.right==null){
            if(sum==targetSum) return true;
            else{
                sum-=root.val;
                return false;
            }
        }
        return fn(root.left , targetSum , sum) || fn(root.right , targetSum , sum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        return fn(root , targetSum , 0);
    }
}