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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> s = new ArrayList<>();
        bin(root,s, "");
        return s;
    }
    
    public void bin(TreeNode root, List<String> s, String str){
        if(root.left == null && root.right == null){
            s.add(str + root.val);
            return ;
        }
        if(root.left != null){
            bin(root.left, s, str  + root.val+ "->");
        }
        if(root.right != null){
            bin(root.right, s, str  + root.val+ "->");
        }
    }
}