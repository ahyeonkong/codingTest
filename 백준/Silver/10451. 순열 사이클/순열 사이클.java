import java.util.Scanner;

public class Main {
    static int N;
    static int[] arr;// 입력된 순열 저장
    static boolean[] visited;// 방문 여부 체크
    static int cycle;// 사이클 개수

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 테스트 케이스 수
        int T = scanner.nextInt();

        for(int t = 0; t < T; t++){
            N = scanner.nextInt();
            arr = new int[N+1];
            visited = new boolean[N+1];
            cycle = 0;

            // 순열 입력 받기
            for(int i = 1; i <= N; i++) {
                arr[i] = scanner.nextInt();
            }

            for(int i = 1; i <= N; i++) {
                // 방문하지 않은 노드라면 DFS 시작 (새로운 사이클 발견)
                if(!visited[i]){
                    DFS(i);
                    cycle++; // 사이클 하나 발견
                }
            }
            System.out.println(cycle);
        }
            scanner.close();
        }

    // DFS 함수: 현재 노드를 방문하고, 다음 노드로 재귀 호출
    static void DFS(int current) {
        // 현재 노드 방문 처리
        visited[current] = true;
        // 현재 노드가 가리키는 다음 노드
        int next = arr[current];
        // 다음 노드를 방문하지 않았다면 계속 탐색
        if(!visited[next])
            DFS(next);
    }
}
