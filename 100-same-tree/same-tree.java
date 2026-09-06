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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        traversal(p,a);
        traversal(q,b);

        if(a.equals(b))
        {
            return true;
        }
        return false;
    }

    private void traversal(TreeNode root, List<Integer> a)
    {
        if(root == null) 
        {
            a.add(null);
            return;
        }

       
        a.add(root.val);
         traversal(root.left, a);
        traversal(root.right,a);

    }
}