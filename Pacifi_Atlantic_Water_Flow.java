import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pacifi_Atlantic_Water_Flow {
         int [][] direction={{1,0},{-1,0},{0,1},{0,-1}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows=heights.length, cols=heights[0].length;
        boolean[][]pac=new boolean[rows][cols];
        boolean[][]alt=new boolean[rows][cols];
        for (int c=0; c<cols; c++){
            dfs(0, c , pac,heights);
            dfs(rows-1, c, alt, heights);
        }
         for (int r=0; r<rows; r++){
            dfs(r, 0, pac,heights);
            dfs(r, cols-1, alt, heights);
        }
        List<List<Integer>> res =new ArrayList<>();
        for(int r=0; r<rows; r++){
            for(int c=0; c<cols; c++){
                if(pac[r][c]&& alt[r][c]){
                res.add(Arrays.asList(r,c));
            }
        }
        }
        return res;
        

        
    }
    void dfs(int r , int c, boolean [][] ocean, int [][]heights){
       ocean[r][c] = true;
        for (int[] d : direction) {
            int nr = r + d[0], nc = c + d[1];
            if (nr >= 0 && nr < heights.length &&
                nc >= 0 && nc < heights[0].length &&
                !ocean[nr][nc] && heights[nr][nc] >= heights[r][c]) {
                dfs(nr, nc, ocean, heights);
            }
        }
    }
    
}
