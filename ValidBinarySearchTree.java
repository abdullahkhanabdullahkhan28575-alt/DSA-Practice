public class ValidBinarySearchTree {

    

public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE,Long.MAX_VALUE);
        
    }
    public boolean valid(TreeNode node, long left, long right){
        if(node==null){
            return true;

        }
        if(!(left<node.val && node.val<right)){
            return false;

        }
        return valid (node.left, left, node.val)&&
       valid(node.right, node.val, right); 
    }
}