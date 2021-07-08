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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr =new ArrayList<>();
        help(root, arr);
        return arr;
    }
    
    public List<Integer> help(TreeNode root, List<Integer> arr){
        if(root != null){
            arr.add(root.val);
            
            if(root.left != null){
                help(root.left, arr);
            }
            if(root.right != null){
                help(root.right, arr);
            }
        }
        return arr;
    }
}