
import java.util.Stack;


class  TreeNode{
    int val;
    
    TreeNode left;
    TreeNode  right;
    TreeNode(int val){
        this.val=val;
    }
    
}
public class InvertBinaryTree {
    
    
    public TreeNode invertTree(TreeNode root) {
            
        if (root == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }
        return root;
    }
    public static void main(String[] args) {
        InvertBinaryTree obj=new InvertBinaryTree();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.right.right=new TreeNode(5);
        obj.invertTree(root);
        System.out.println("Root Left :"+ root.left.val);
        System.out.println("Root Left :"+ root.right.val);


    }
    
}
