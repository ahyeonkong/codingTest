import java.util.*;

public class Main {
    // 총 층수(f), 시작 층(s), 목표 층(g), 위로 갈 수 있는 층 수(u), 아래로 갈 수 있는 층 수(d) 선언
    static int F, S, G, U, D;
    // 방문 여부를 저장할 배열 visited 선언
    static boolean[] visited;
    // 각 층까지의 최소 이동 횟수를 저장할 배열 move 선언
    static int[] move;
    // 위로/아래로 이동 값을 저장할 배열 pos 선언
    static int[] pos;

    public static void main(String[] args) {
        // Scanner로 입력 받기
        Scanner scanner = new Scanner(System.in);

        // 입력값 저장: f, s, g, u, d
        F = scanner.nextInt();
        S = scanner.nextInt();
        G = scanner.nextInt();
        U = scanner.nextInt();
        D = scanner.nextInt();

        // pos 배열에 u와 -d 저장 (위로는 양수, 아래로는 음수)
        pos = new int[]{U, -D};
        // move 배열과 visited 배열 크기 초기화
        move = new int[F + 1];
        visited = new boolean[F + 1];

        // bfs 함수 호출 (시작 층 전달)
            BFS(S);
    }

    // bfs 함수 정의
    static void BFS(int x){
        // 큐 생성 및 시작 층 큐에 추가
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        // 시작 층 방문 처리 및 이동 횟수 0으로 설정
        visited[x] = true;
         move[x] = 0;

        // 큐가 빌 때까지 반복
         while(!queue.isEmpty()){
             // 현재 층 꺼내기
             int now = queue.poll();
             // 현재 층이 목표 층이면 이동 횟수 출력 후 종료
             if(now == G){
                 System.out.println(move[now]);
                 return;
             }
             // 위로/아래로 이동 가능한 두 방향에 대해 반복
             // 다음 층 계산 (현재 층 + pos[i])
             for(int i = 0; i < 2; i++){
                 int next = now + pos[i];
                 // 다음 층이 유효한 범위(1 ~ f)이고 아직 방문하지 않았다면
                 // 방문 처리
                 // 큐에 추가
                 // 이동 횟수 갱신 (현재 층 이동 횟수 + 1)
                 if(next <= F && next >= 1 && !visited[next]){
                     visited[next] = true;
                     queue.add(next);
                     move[next] = move[now] + 1;
                 }
             }
         }
        // 큐를 다 돌았는데도 목표 층에 도달하지 못한 경우 "use the stairs" 출력
        System.out.println("use the stairs");
    }
}
