import java.util.*;

public class Main {

    static int N;                      // 도시 수
    static int[][] W;                 // 비용 행렬
    static boolean[] visited;         // 방문 여부 확인 배열
    static int minCost = Integer.MAX_VALUE;  // 최소 비용 저장 변수

    public static void main(String[] args) {
        // 입력을 위한 Scanner 생성
        Scanner scanner = new Scanner(System.in);

        // 도시 수 입력 받기
        N = scanner.nextInt();

        // 비용 행렬 크기 초기화
        W = new int[N][N];

        // 방문 배열 초기화
        visited = new boolean[N];

        // 비용 행렬 입력 받기
        // W[i][j] = i번 도시에서 j번 도시로 가는 비용
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                W[i][j] = scanner.nextInt();
            }
        }

        // 모든 도시를 출발점으로 하여 DFS 수행
        for (int i = 0; i < N; i++) {
            // 시작 도시 방문 표시
            visited[i] = true;

            // DFS 시작 (출발도시, 현재도시, 누적비용 0, 방문한 도시 수 1)
            dfs(i, i, 0, 1);

            // 방문 해제 (백트래킹을 위한 초기화)
            visited[i] = false;
        }

        // 최소 비용 출력
        System.out.println(minCost);
    }

    // DFS + 백트래킹 함수
    static void dfs(int start, int now, int cost, int count) {
        // 모든 도시를 방문한 경우 (start로 돌아가는 비용도 확인)
        if (count == N) {
            // 시작 도시로 돌아가는 경로가 존재할 경우만 처리
            if(W[now][start] != 0){
                minCost = Math.min(minCost, cost + W[now][start]); // 최소 비용 갱신
            }
            return;
        }

        // 다음 도시 탐색
        for (int i = 0; i < N; i++) {
            // 아직 방문하지 않았고, 현재 도시에서 i번 도시로 가는 경로가 존재할 경우
            if (!visited[i] && W[now][i] != 0) {
                // i번 도시 방문 표시
                visited[i] = true;

                // DFS 재귀 호출 (다음 도시로 이동)
                dfs(start, i, cost + W[now][i], count + 1);

                // 방문 해제 (백트래킹)
                visited[i] = false;
            }
        }
    }
}
