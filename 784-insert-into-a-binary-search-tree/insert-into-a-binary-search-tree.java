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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode temp = new TreeNode(val);
        if (root == null){
            root = temp;
            return root;
        }
        TreeNode current = root;
        while(current!=null)
        {
            if (current.val < val)
            {
                if (current.right == null) {
                    current.right = temp;
                    return root;
                }
                current = current.right;
            }
            if (current.val > val)
            {
                if (current.left == null) {
                    current.left = temp;
                    return root;
                }
                current = current.left;
            }
        }
        return root;
    }
}