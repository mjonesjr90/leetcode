// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class MaximumDepthOfBinaryTree {
    public static int maxDepth(TreeNode root) {
        int depthA = 0;
        int depthB = 0;

        //if a null root is passed, depth is 0
        if(root == null) {
            return 0;
        }

        //if the current node is a leaf, count itself
        if(root.left == null && root.right == null) {
            // System.out.println("ROOT:" + root.val);
            return 1;
        }
        else {
            // System.out.println("ELSE");
            // System.out.println("ROOT:" + root.val);
            if(root.left != null) {
                // System.out.println("CHILD:" + root.left.val);
                depthA = maxDepth(root.left) + 1;
                // System.out.println("DEPTHA: " + depthA);
            }

            if(root.right != null) {
                // System.out.println("CHILD:" + root.right.val);
                depthB = maxDepth(root.right) + 1;
                // System.out.println("DEPTHB: " + depthB);
            }

            //if depthA is greater than depthB, return depthA
            //if not return depthB
            return (depthA > depthB) ? depthA : depthB;
        }
    }

    public static void main(String[] args) {
        TreeNode x = new TreeNode(7);
        TreeNode w = new TreeNode(1);
        TreeNode y = new TreeNode(15);
        TreeNode c = new TreeNode(20);
        TreeNode b = new TreeNode(9);
        TreeNode a = new TreeNode(3);

        x.left = w;
        c.left = x;
        c.right = y;
        a.left = b;
        a.right = c;

        System.out.println("The depth of the binary tree is " + maxDepth(a));
    }
}
