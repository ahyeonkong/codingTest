import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph; // 그래프를 인접 리스트로 표현할 배열, 각 정점마다 연결된 정점 리스트 저장
    static int[] order; // 각 정점의 방문 순서를 저장하는 배열
    static int cnt = 1; // 방문 순서 카운터

    // DFS 함수, u: 현재 방문 중인 정점
    static void dfs(int u) {
        order[u] = cnt++; // 현재 정점을 방문 순서대로 기록하고 cnt 증가
        // 현재 정점 u와 연결된 모든 정점 v에 대해
        for (int v : graph[u]) {
            // 아직 방문하지 않은 정점이면 재귀 호출로 방문
            if (order[v] == 0) dfs(v);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 정점 수 N, 간선 수 M, 시작 정점 R 입력받음
        int N = sc.nextInt(), M = sc.nextInt(), R = sc.nextInt();

        // 그래프 배열 생성
        graph = new ArrayList[N + 1];
        order = new int[N + 1]; // 방문 순서 배열 초기화 (기본값 0)

        // 각 정점별 인접 리스트 초기화
        for (int i = 1; i <= N; i++) graph[i] = new ArrayList<>();

        // 간선 입력 받기 (무방향 그래프이므로 양쪽 모두 추가)
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }

        // 각 정점의 인접 리스트를 내림차순 정렬
        for (int i = 1; i <= N; i++)
            Collections.sort(graph[i], Collections.reverseOrder());

        // 시작 정점 r부터 DFS 탐색 시작
        dfs(R);

        // 1번 정점부터 n번 정점까지 방문 순서 출력
        // 방문하지 않은 정점은 0 출력됨
        for (int i = 1; i <= N; i++)
            System.out.println(order[i]);
    }
}
