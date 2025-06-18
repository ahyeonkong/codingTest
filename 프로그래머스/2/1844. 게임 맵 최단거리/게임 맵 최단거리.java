import java.util.*;

class Solution {
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};

    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        int[][] visited = new int[n][m];

        bfs(maps, visited, n, m);

        int answer = visited[n - 1][m - 1];
        return (answer == 0) ? -1 : answer;
    }

    private void bfs(int[][] maps, int[][] visited, int n, int m) {
        visited[0][0] = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && maps[nx][ny] == 1 && visited[nx][ny] == 0) {
                    visited[nx][ny] = visited[x][y] + 1;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }
}
