
class Solution {
      public List<Integer> inorder(TreeNode root , List<Integer> list){
        if(root==null) return list;
        list.add(root.val);
        inorder(root.left , list);
        inorder(root.right , list);
        return list;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
          return inorder(root , new ArrayList<Integer>());
    }
}