import java.util.*;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class BinaryTreeInorderTraversal {
   static List<Integer> l = new ArrayList<Integer>();
   public static List<Integer> inorderTraversal(TreeNode root) {
      if(root == null) {
         return l;
      }

      else {

         //recur on the left side
         inorderTraversal(root.left);

         //add root
         l.add(root.val);

         //recur on the right side
         inorderTraversal(root.right);

         return l;
      }
   }

   public static void main(String[] args) {
      TreeNode x = new TreeNode(1);
      TreeNode w = new TreeNode(2);
      TreeNode y = new TreeNode(3);

      w.left = y;
      x.right = w;

      List<Integer> a = new ArrayList<Integer>();
      a = inorderTraversal(x);
      for(int i = 0; i < a.size(); i++) {
         System.out.println(a.get(i));
      }
   }
}
