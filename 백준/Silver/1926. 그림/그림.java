import java.util.*;
public class Main {

    static int N;
    static int M;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        map = new int[N][M];
        visited = new boolean[N][M];
        int count = 0;
        int maxArea = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    count++;
                    int area = BFS(i, j);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        System.out.println(count);
        System.out.println(maxArea);
    }

    static int BFS(int x, int y) {
        // BFS를 위한 큐 생성
        Queue<int[]> queue = new LinkedList<>();
        // 시작 좌표 (x, y)를 큐에 넣고 방문 표시
        queue.offer(new int[]{x, y});
        visited[x][y] = true;
        // 그림의 넓이를 세기 위한 변수 초기화 (처음 좌표 포함해서 1)
        int area = 1;
        // 큐가 빌 때까지 반복
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int cx = now[0];
            int cy = now[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if (!visited[nx][ny] && map[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx, ny});
                        area++;
                    }
                }
            }
        }
        return area;
    }
}
