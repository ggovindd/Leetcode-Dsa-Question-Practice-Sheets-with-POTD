class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        boolean [][] visited = new boolean[m][n];

        visited[0][0] = true;
        int result[]=new int[2];
        
        for(int i = 0; i<m*n;i++){
              
               int x = result[0];
                int y = result[1];

           if (grid[x][y] == 'R') {
                y++;
            } else if (grid[x][y] == 'L') {
                y--;
            } else if (grid[x][y] == 'U') {
                x--;
            } else if (grid[x][y] == 'D') {
                x++;
            } 
            if (x < 0 || x >= m || y < 0 || y >= n || visited[x][y]) {
                break;
            }
            visited[x][y] = true;
            result[0] = x;
            result[1] = y;
         
            
        } return result;
    }
}