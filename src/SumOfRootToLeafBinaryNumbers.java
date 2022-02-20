public class SumOfRootToLeafBinaryNumbers {
    /*
    https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
     */
    class TreeNode {
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
      public int sumRootToLeaf(TreeNode root) {
       return sumRootToLeaf(root, 0);
      }
      public int sumRootToLeaf(TreeNode root, int sum){
       if(root == null) return 0;
       sum = (2 * sum) + root.val;
       if(root.left == null && root.right == null) return sum;
       return sumRootToLeaf(root.left, sum) + sumRootToLeaf(root.right, sum);
      }
}
