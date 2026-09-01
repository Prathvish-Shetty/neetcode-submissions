class Solution {
    private void bfs(char[][] grid, int i, int j, boolean[][] visited, int m, int n){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{i, j});
        visited[i][j] = true;
        int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        while(!q.isEmpty()){
            int[] f = q.poll();
            int x = f[0], y = f[1];
            for(int[] d : directions){
                int ni = x+d[0], nj = y+d[1];
                if(ni >=0 && ni < m && nj >= 0 && nj < n && grid[ni][nj] == '1' && !visited[ni][nj]){
                q.offer(new int[]{ni, nj});
                visited[ni][nj] = true;
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length, noi = 0;
        boolean[][] visited = new boolean[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    bfs(grid, i, j, visited, m, n);
                    noi++;
                }
            }
        }
        return noi;
    }
}
