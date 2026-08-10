import javax.swing.tree.TreeNode;

public class Q101 {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
         this.right = right;
     }
  }
    public boolean isSymmetric(TreeNode root) {
        return helper(root.left, root.right);
    }

    public boolean helper(TreeNode left, TreeNode right){
        if(left == null && right ==null){
            return true;
        }

        if (left == null || right == null) {
    return false;
}


        if (left.val != right.val) {
    return false;
}

        boolean a1 = helper(left.left, right.right);
        boolean a2 = helper(left.right, right.left);

        return a1 && a2 ;
    }
}
