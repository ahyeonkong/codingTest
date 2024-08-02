import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// DFS BFS 인접 행렬

public class Main {
    static int N, M, V;
    static int[][] arr;
    static boolean[] visited;
    static StringBuilder stringBuilder = new StringBuilder();
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

         N = Integer.parseInt(stringTokenizer.nextToken());
         M = Integer.parseInt(stringTokenizer.nextToken());
         V = Integer.parseInt(stringTokenizer.nextToken());
         arr = new int[N+1][N+1];
         visited = new boolean[N+1];

        for(int i = 0; i < M; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());

            arr[a][b] = arr[b][a] = 1; // 초기화
        }

        DFS(V);
        stringBuilder.append("\n");
        visited = new boolean[N+1];
        BFS(V);
        System.out.println(stringBuilder);

        bufferedReader.close();
    }

    public static void DFS(int start){
        visited[start] = true;
        stringBuilder.append(start + " ");

        for(int i = 0; i <= N; i++){
            if(arr[start][i] == 1 && !visited[i]){
                DFS(i);
            }
        }
    }
    public static void BFS(int start){
        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()){
            start = queue.poll();
            stringBuilder.append(start + " ");

            for(int i = 1; i <= N; i++){
                if(arr[start][i] == 1 && !visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}