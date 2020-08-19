/*104_Maximum Depth of Binary Tree
Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
Memory Usage: 39.2 MB, less than 91.90% of Java online submissions for Maximum Depth of Binary Tree.*/

class Solution {
    public int maxDepth(TreeNode root) {
         if(root==null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}


/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
Memory Usage: 39.2 MB, less than 95.29% of Java online submissions for Maximum Depth of Binary Tree.
 
class Solution {
    public int maxDepth(TreeNode root) {
        return helper(root,0);
    }
    
    public int helper(TreeNode root, int n) {
        if(root==null)
        return 0;
        
       
        int left=0,right=0;
        
            left=helper(root.left,n);
        
            right=helper(root.right,n);
        
        return 1+Math.max(right,left);
    }
}
*/
