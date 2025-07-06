import java.util.*;

public class Main {
    static int N;
    static int M;
    static int[] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        arr = new int[M];

        dfs(0,1);
    }

    // DFS 함수: 현재까지 선택한 수의 개수(cnt)와 이전에 선택한 수의 인덱스(start)를 인자로 받아서 재귀 호출
    static void dfs(int cnt, int start) {
        // M개를 모두 선택했으면 결과 출력 후 종료
        if (cnt == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        // start부터 N까지 반복하면서 다음 수 선택 시도
        for (int i = start; i <= N; i++) {
            arr[cnt] = i;
            dfs(cnt + 1, i + 1);
            // 선택한 i를 다시 해제(백트래킹)
        }
    }
}