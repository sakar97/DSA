class rat_in_a_maze {
    public static void main(String[] args) {
        RatMaze rat = new RatMaze();
        int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };

        int n = maze.length;
        int m = maze[0].length;
        boolean[][] vis = new boolean[n][m];
        StringBuffer ans = new StringBuffer();
        rat.solveMaze(0, 0, maze, n, vis, ans, "");
        System.out.println(ans);
    }
}

class RatMaze {
    public void solveMaze(int i, int j, int[][] maze, int n, boolean[][] vis, StringBuffer ans, String move) {
        if (i == n - 1 && j == n - 1) {
            ans.append(move);
            return;
        }
        // For downward direction
        if (i + 1 < n && maze[i + 1][j] == 1 && vis[i + 1][j] == false) {
            vis[i + 1][j] = true;
            solveMaze(i + 1, j, maze, n, vis, ans, move + "D");
            vis[i + 1][j] = false;
        }
        // For leftward direction
        if (j - 1 >= 0 && maze[i][j - 1] == 1 && vis[i][j - 1] == false) {
            vis[i][j - 1] = true;
            solveMaze(i, j - 1, maze, n, vis, ans, move + "L");
            vis[i][j - 1] = false;
        }
        // For rightward direction
        if (j + 1 < n && maze[i][j + 1] == 1 && vis[i][j + 1] == false) {
            vis[i][j + 1] = true;
            solveMaze(i, j + 1, maze, n, vis, ans, move + "R");
            vis[i][j + 1] = false;
        }
        // For upward direction
        if (i - 1 >= 0 && maze[i - 1][j] == 1 && vis[i - 1][j] == false) {
            vis[i - 1][j] = true;
            solveMaze(i - 1, j, maze, n, vis, ans, move + "U");
            vis[i - 1][j] = false;
        }
    }
}