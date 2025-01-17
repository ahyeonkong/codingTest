import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] graph = new int[1001][1001];
    static boolean[] visited = new boolean[1001];
    static int N;
    static int M;
    public static void dfs(int index){
        visited[index] = true;
        for(int j = 1; j <= N; j++){
            if(!visited[j] && graph[index][j] == 1){
                dfs(j);
            }
        }
    }

    public static int countComponents(){
        int result = 0;
        for(int j = 1; j <= N; j++){
            if(!visited[j]){
                dfs(j);
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());

        for(int i = 0; i < M; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int u = Integer.parseInt(stringTokenizer.nextToken());
            int v = Integer.parseInt(stringTokenizer.nextToken());

            graph[u][v] = 1;
            graph[v][u] = 1;
        }
        System.out.println(countComponents());
    }
}