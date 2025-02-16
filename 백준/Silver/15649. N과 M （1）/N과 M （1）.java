import java.io.*;
import java.util.*;

public class Main {
    static int N, M;               // N과 M 값을 전역변수로 선언
    static int[] arr;             // 수열을 저장할 배열
    static boolean[] visited;      // 숫자 사용 여부를 체크할 배열
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        // 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];           // M개의 숫자를 저장할 배열
        visited = new boolean[N+1];  // 1~N까지의 숫자 사용 여부 체크 (0은 사용안함)

        dfs(0);  // 깊이 0부터 시작
        System.out.println(sb);
    }

    // depth는 현재 수열의 길이를 의미
    static void dfs(int depth) {
        // 1. 종료 조건: 수열의 길이가 M이 되면 출력
        if (depth == M) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        // 2. 1부터 N까지의 수를 현재 위치(depth)에 넣어보기
        for (int i = 1; i <= N; i++) {
            // 3. 아직 사용하지 않은 숫자라면
            if (!visited[i]) {
                visited[i] = true;     // 숫자 i 사용 표시
                arr[depth] = i;        // 현재 깊이에 i 저장
                dfs(depth + 1);       // 다음 깊이 호출
                visited[i] = false;    // 사용 표시 제거 (백트래킹)
            }
        }
    }
}