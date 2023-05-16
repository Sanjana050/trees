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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        TreeNode curr=root;
        TreeNode pre=null;
        while(curr!=null)
        {
            if(curr.left!=null)
            {

pre=curr.left;
while(pre.right!=null && pre.right!=curr)

{
    pre=pre.right;
}
if(pre.right==null)
{
    pre.right=curr;
    curr=curr.left;
}
else
{
    list.add(curr.val);
    pre.right=null;
    
    curr=curr.right;
}
            }
            else
            {

list.add(curr.val);
curr=curr.right;
            }
        }
        return list;
        
    }
}