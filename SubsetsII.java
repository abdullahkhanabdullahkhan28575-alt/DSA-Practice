import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetsII {
    
    Set<List<Integer>> res = new  HashSet<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums,0,new ArrayList<>());
        return new ArrayList<>(res);

        
    }
    private void backtrack(int [] nums, int i, List<Integer>subset){
        if(i==nums.length){
            res.add(new ArrayList<>(subset));
            return ;

        }
        subset.add(nums[i]);
        backtrack(nums, i+1, subset);
        subset.remove(subset.size()-1);
        backtrack(nums,i+1, subset);
    }

    
}
