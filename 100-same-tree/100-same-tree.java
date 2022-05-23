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
          Stack<TreeNode> pStack = new Stack<>();
        Stack<TreeNode> qStack = new Stack<>();
        pStack.push(p);
        qStack.push(q);
        
        while(!qStack.isEmpty()){
            TreeNode qTemp = qStack.pop();
            TreeNode pTemp = pStack.pop();
            if(pTemp == null && qTemp == null)
                continue;
            if(pTemp == null || qTemp == null)
                return false;
            if(pTemp.val != qTemp.val)
                return false;
            pStack.push(pTemp.left);
            pStack.push(pTemp.right);
            qStack.push(qTemp.left);
            qStack.push(qTemp.right);
        }
        return true;
        
    }
}