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
    public boolean isValidBST(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        help(root, arr);
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i) >= arr.get(i+1)){
                return false;
            }
        }
        return true;
    }
    
     public List<Integer> help(TreeNode root, List<Integer> res){
        if(root != null){
            if(root.left != null){
                help(root.left, res);
            }
            res.add(root.val);
            if(root.right != null){
                help(root.right, res);
            }
        }
        return res;
    }
}