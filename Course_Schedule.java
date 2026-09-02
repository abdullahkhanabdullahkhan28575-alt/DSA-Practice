import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Course_Schedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int indgree[]=new int[numCourses];
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0; i<numCourses; i++){
            adj.add(new ArrayList<>());

        }
        for(int [] per : prerequisites){
            indgree[per[1]]++;
            adj.get(per[0]).add(per[1]);

        }
        Queue <Integer> q =new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(indgree[i]==0){
                q.add(i);
            }
        }
                 int finish = 0;
        while (!q.isEmpty()) {
            int node = q.poll();
            finish++;
            for (int nei : adj.get(node)) {
                indgree[nei]--;
                if (indgree[nei] == 0) {
                    q.add(nei);
                }
            }
        }

        return finish == numCourses;
    }
    
}
