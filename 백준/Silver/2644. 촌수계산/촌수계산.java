import java.io.*;
import java.util.*;

public class Main {
    static int n, a, b, m;
    static int answer = -1;
    static boolean[][] graph; // 그래프 연결 여부 의미
    static boolean[] visited; // 노드 방문 여부 의미

    public static void dfs(int index, int count){ // index: 현재 탐색 중인 노드 번호, count: 이동 횟수
        visited[index] = true;

        if(index == b) // 현재 노드가 도착 노드라면, 이동 횟수를 answer에 저장
            answer = count;

        for(int i = 1; i <= n; i++){
            if(!visited[i] && graph[index][i]){ // 방문하지 않은 노드인지, 현재 노드와 연결되어 있는지
                dfs(i, count+1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        n = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        a = Integer.parseInt(stringTokenizer.nextToken());
        b = Integer.parseInt(stringTokenizer.nextToken());

        m = Integer.parseInt(bufferedReader.readLine());

        graph = new boolean[n+1][n+1]; // 노드 번호를 1부터 n까지 사용하기 위함
        visited = new boolean[n+1]; // 노드 번호를 1부터 n까지 사용하기 위함

        for(int i = 0; i < m; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());
            
            // 양방향 연결이므로 모두 true 처리
            graph[x][y] = true;
            graph[y][x] = true;

        }
        dfs(a, 0);
        System.out.print(answer);
    }
}
