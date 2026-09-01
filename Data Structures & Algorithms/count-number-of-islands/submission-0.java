class Solution {
    private void dfs(char[][] grid, int i, int j, boolean[][] visited, int m, int n){
        visited[i][j] = true;
        int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        for(int[] d : directions){
            int ni = i+d[0], nj = j+d[1];
            if(ni >=0 && ni < m && nj >= 0 && nj < n && grid[ni][nj] == '1' && !visited[ni][nj]){
                dfs(grid, ni, nj, visited, m, n);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length, noi = 0;
        boolean[][] visited = new boolean[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    dfs(grid, i, j, visited, m, n);
                    noi++;
                }
            }
        }
        return noi;
    }
}
