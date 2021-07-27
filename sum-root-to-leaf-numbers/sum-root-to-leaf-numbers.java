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
    int sum =0 ;
    public int sumNumbers(TreeNode root) {
        sums(root,0);
        return sum;
    }
    
    public void sums(TreeNode root, int c){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            sum += c*10 + root.val;
            return;
        }
        if(root.left != null){
            int num = c*10+root.val;
            sums(root.left,num);
        }
        if(root.right != null){
            int num = c*10 + root.val;
            sums(root.right, num);
        }
    }
}