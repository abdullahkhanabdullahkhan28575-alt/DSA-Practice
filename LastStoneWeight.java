import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
          List<Integer> stoneList = new ArrayList<>();
        for (int stone : stones) {
            stoneList.add(stone);
        }

        while (stoneList.size() > 1) {
            Collections.sort(stoneList);
            int cur = stoneList.remove(stoneList.size() - 1) -
                      stoneList.remove(stoneList.size() - 1);
            if (cur != 0) {
                stoneList.add(cur);
            }
        }

        return stoneList.isEmpty() ? 0 : stoneList.get(0);
    }
        
    }

    

