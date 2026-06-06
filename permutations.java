import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutations {

    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0){
            return Arrays.asList(new ArrayList<>());

        }
        List<List<Integer>> perms= permute(Arrays.copyOfRange(nums, 1, nums.length));
        List<List<Integer>> res =new ArrayList<>();
        for(List<Integer> p: perms){
            for( int i =0; i<=p.size(); i++){
                List<Integer> p_copy= new ArrayList<>(p);
                p_copy.add(i, nums[0]);
                res.add(p_copy);
    
            }
        }
        return res;

        
    }
}

    

