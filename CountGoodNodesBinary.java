public class CountGoodNodesBinary {
     public int goodNodes(TreeNode root) {
        return dfs(root, root .val);


        
    }
    private int dfs(TreeNode node, int maxval){
        if(node==null){
            return 0;

        }
         int res =(node.val >=maxval)?1:0;
         maxval =Math.max(maxval,node.val);
         res+=dfs(node.left, maxval);
         res +=dfs(node .right, maxval);
         return res;



    }
    
}
