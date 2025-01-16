import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    /*
        1. 배추가 나오면 벌레++;
        2. 네 방향 모두 탐색하여, 배추와 인접한 배추 찾기 -> 1을 0으로 변환
        3. 벌레 개수 반환
    */
    static int[][] field;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int M;
    static int N;
    static int K;
    static int worm;

    // dfs
    public static void dfs(int y, int x){
        visited[y][x] = true;

        // 상하좌우 네 방향 탐색
        for(int i = 0; i < 4; i++){
            int ny = dy[i] + y;
            int nx = dx[i] + x;

            if(ny >= 0 && nx >= 0 && ny < N && nx < M){
                if(field[ny][nx] == 1 && !visited[ny][nx])
                    dfs(ny,nx);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer;

        for(int i = 0; i < T; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            M = Integer.parseInt(stringTokenizer.nextToken());
            N = Integer.parseInt(stringTokenizer.nextToken());
            K = Integer.parseInt(stringTokenizer.nextToken());
            field = new int[N][M];
            visited = new boolean[N][M];
            worm = 0;

            // 배추 심기
            for (int j = 0; j < K; j++) {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                int X = Integer.parseInt(stringTokenizer.nextToken());
                int Y = Integer.parseInt(stringTokenizer.nextToken());
                field[Y][X] = 1;
            }

            // 필드 탐색
            for (int k = 0; k < N; k++) {
                for (int l = 0; l < M; l++) {
                    if (field[k][l] == 1 && !visited[k][l]) {
                        dfs(k, l);
                        worm++;
                    }
                }
            }
            System.out.println(worm);
        }
    }
}