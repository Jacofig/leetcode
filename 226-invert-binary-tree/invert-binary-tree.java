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
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        if(root==null)return root;
        while(!q.isEmpty())
        {
            TreeNode current = q.poll();
            TreeNode left = current.left;
            TreeNode right = current.right;
            current.left=right;
            current.right=left;
            if(current.left!=null) q.offer(current.left);
            if(current.right!=null)q.offer(current.right);
        }
        return root;
    }
}