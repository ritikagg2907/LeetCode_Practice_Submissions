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
    public int sumRootToLeaf(TreeNode root) {
        ArrayList<String> arr = new ArrayList<>();
        String s = "";
        sum(root, s, arr);
        int res = 0;
        for(String str : arr){
            res += Integer.parseInt(str, 2);
        }
        return res;
    }
    
    public void sum(TreeNode root, String str, ArrayList<String> arr){
        if(root == null){
            return ;
        }
        if(root.left == null && root.right == null){
            str += Integer.toString(root.val);
            arr.add(str);
            return;
        }
        if(root.left != null){
            sum(root.left, str+Integer.toString(root.val), arr);
        }
        if(root.right != null){
            sum(root.right, str+Integer.toString(root.val) , arr);
        }
    }
}