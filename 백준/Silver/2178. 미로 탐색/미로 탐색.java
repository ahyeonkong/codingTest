import java.awt.Point;
import java.util.*;

// 최소 경로이므로 BFS로 구현
// dx, dy, map, visited 구현 후 BFS 함수 구현

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] map;
    static int N, M;
    static boolean[][] visited;

    public static void main(String[] args) {
        // 값 입력 받기
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        map = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++){
            String line = scanner.next();
            for(int j = 0; j < M; j++){
                map[i][j] = line.charAt(j) - '0';
            }
        }

        // 1, 1부터 시작하지만 배열은 0,0부터 시작
        BFS(0, 0);

        // 최종 결과 출력
        System.out.println(map[N-1][M-1]);

    }
    static void BFS(int x, int y){
        Queue<Point> queue = new LinkedList<>();

        queue.add(new Point(x, y));
        visited[x][y] = true;

        while(!queue.isEmpty()){
            // 큐에서 현재 위치를 Point 객체로 꺼냄
            Point current = queue.poll();

            for(int i =0; i < 4; i++){
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                // 위치 범위 유효성 검사
                if(nx < 0 || ny < 0 || nx >= N || ny >= M)
                    continue;
                if(visited[nx][ny] || map[nx][ny] == 0)
                    continue;

                // 가보지 않은 새로운 길 발견
                queue.add(new Point(nx, ny));
                // 큐에 넣자마자 바로 visited 바꿔야 함
                visited[nx][ny] = true;
                map[nx][ny] = map[current.x][current.y] + 1;
            }
        }
    }
}
