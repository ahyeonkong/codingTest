import java.util.*;

public class Main {
    static int N, K;
    static boolean[] visited;
    static int[] arr;
    static final int[] moves = {-1, 1, 0};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        K = scanner.nextInt();
        visited = new boolean[100001];
        arr = new int[100001];

        BFS(N);
    }
    static void BFS(int x){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        visited[x] = true;

        while(!queue.isEmpty()){
            int now = queue.poll();
            if(now == K){
                System.out.println(arr[K]);
                return;
            }
            for(int i = 0; i < 2; i++){
                // 한 칸 앞/뒤로 가는 경우
                int next = now + moves[i];
                if(next >= 0 && next <= 100000 && !visited[next]){
                    // 범위에 들어가있는가
                    visited[next] = true;
                    arr[next] = arr[now] + 1;
                    queue.add(next);
                }
            }
            int doubled = now * 2;
            if(doubled <= 100000 && !visited[doubled]){
                visited[doubled] = true;
                arr[doubled] = arr[now] + 1;
                queue.add(doubled);
            }
        }
    }
}