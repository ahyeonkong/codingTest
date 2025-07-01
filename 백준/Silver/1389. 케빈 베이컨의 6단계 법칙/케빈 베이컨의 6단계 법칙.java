import java.util.*; // Scanner, Queue, ArrayList 등

public class Main {

    static int N, M; // 사람 수, 친구 관계 수
    static List<Integer>[] graph; // 친구 관계를 저장할 인접 리스트

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); // 사람 수 입력
        M = sc.nextInt(); // 친구 관계 수 입력

        graph = new ArrayList[N + 1]; // 1번부터 N번까지 인접 리스트 초기화
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 무방향 그래프 생성
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }

        int minSum = Integer.MAX_VALUE; // 최소 케빈 베이컨 수
        int answer = 0; // 정답이 될 사람 번호

        // 1번부터 N번까지 모든 사람에 대해 BFS 수행
        for (int i = 1; i <= N; i++) {
            int sum = bfs(i); // i번 사람에서 출발해 거리의 합 계산
            if (sum < minSum) {
                minSum = sum; // 최소값 갱신
                answer = i;   // 정답 갱신
            }
        }

        System.out.println(answer); // 가장 케빈 베이컨 수가 작은 사람 번호 출력
    }

    // BFS로 start에서 다른 노드까지의 거리 합 계산
    static int bfs(int start) {
        boolean[] visited = new boolean[N + 1]; // 방문 여부
        int[] distance = new int[N + 1];        // 거리 저장
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int next : graph[current]) {
                if (!visited[next]) {
                    visited[next] = true;
                    distance[next] = distance[current] + 1; // 현재 거리 + 1
                    queue.add(next);
                }
            }
        }

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += distance[i]; // 거리의 총합 계산
        }
        return sum; // 케빈 베이컨 수 반환
    }
}