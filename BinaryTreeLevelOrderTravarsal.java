import java.util.ArrayList;
import java.util.List;

 public class BinaryTreeLevelOrderTravarsal {
 
    
 
    List<List<Integer>> rev= new ArrayList <>();
    public List<List<Integer>> levelOrder(TreeNode root) {
       dfs(root , 0);
        return rev;


            }
            private void dfs(TreeNode node , int depth){
                if( node== null){
                    return;
                }
                if(rev.size()==depth){
                    rev.add(new ArrayList<>());

                }
                rev.get(depth).add(node.val);
                dfs(node.left,depth+1);
                dfs(node.right , depth+1);

            }
        
    }


    

