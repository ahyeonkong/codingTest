import java.util.*;

public class Main {
    // 변수 선언: N(행), M(열), map(입력), visited(방문 체크 배열)
    static int N;
    static int M;
    static char[][] map;
    static boolean[][] visited;

    public static void main(String[] args) {
        // Scanner로 입력 받기
        Scanner scanner = new Scanner(System.in);

        // N, M 입력 받기
        N = scanner.nextInt();
        M = scanner.nextInt();

        // map과 visited 배열 초기화
        map = new char[N][M];
        visited = new boolean[N][M];

        // map 내용 입력 받기 (N줄)
        for(int i = 0; i < N; i++){
            String line = scanner.next();
                for(int j = 0; j < M; j++){
                    map[i][j] = line.charAt(j);
            }
        }

        // 결과 저장 변수 count = 0
        int count = 0;

        // 2중 for문으로 전체 map 순회
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                // 현재 좌표가 방문되지 않았다면
                // dfs 수행
                // count 증가
                if(!visited[i][j]){
                    dfs(i, j);
                    count++;
                }
            }
        }
        // 결과 출력
        System.out.println(count);
    }

    static void dfs(int x, int y) {
        // 1. 현재 좌표 방문 처리
        visited[x][y] = true;

        // 2. 현재 위치가 '-' 인 경우
        if(map[x][y] == '-'){
            // 오른쪽으로 한 칸 이동한 위치가 범위 안이고
            int ny = y + 1;
            // 방문하지 않았고
            // 문자가 '-' 라면
            // dfs 재귀 호출
            if(ny < M && !visited[x][ny] && map[x][ny] == '-'){
                dfs(x, ny);
            }
        }

        // 3. 현재 위치가 '|' 인 경우
        if(map[x][y] == '|'){
            // 아래쪽으로 한 칸 이동한 위치가 범위 안이고
            int nx = x + 1;
            // 방문하지 않았고
            // 문자가 '|' 라면
            // dfs 재귀 호출
            if(nx < N && !visited[nx][y] && map[nx][y] == '|'){
                dfs(nx, y);
            }
        }
    }
}
