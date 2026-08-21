import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) {
            return -1;
        }
        if (n == 1) {
            return 1;
        }
        int[][] directions = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1},           {0, 1},
            {1, -1},  {1, 0},  {1, 1}
        };
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1});
        
        grid[0][0] = 1;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];
            int steps = current[2];
            
            for (int[] dir : directions) {
                int newR = r + dir[0];
                int newC = c + dir[1];
                if (newR >= 0 && newR < n && newC >= 0 && newC < n && grid[newR][newC] == 0) {
                    if (newR == n - 1 && newC == n - 1) {
                        return steps + 1;
                    }
                    queue.offer(new int[]{newR, newC, steps + 1});
                    grid[newR][newC] = 1;
                }
            }
        }
        
        return -1;
    }
}
