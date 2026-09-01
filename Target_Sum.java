import java.util.HashMap;
import java.util.Map;

public class Target_Sum {
     public int findTargetSumWays(int[] nums, int target) {
        Map<Integer, Integer> dp= new HashMap<>();
        dp.put(0,1);
        for(int num:nums){
            Map<Integer, Integer> nextDp=new HashMap<>();
            for(Map.Entry<Integer, Integer> entry: dp.entrySet()){
                int total =entry.getKey();
                int count =entry.getValue();
               
               
              nextDp.put(total + num,
                           nextDp.getOrDefault(total + num, 0) + count);
                nextDp.put(total - num,
                           nextDp.getOrDefault(total - num, 0) + count);
            }
            dp = nextDp;
        }
        return dp.getOrDefault(target, 0);
    }
    
}
