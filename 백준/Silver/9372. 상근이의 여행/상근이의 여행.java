import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static boolean[] visited;
	static ArrayList<Integer>[] graph;
	static int count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			graph = new ArrayList[N + 1];
			visited = new boolean[N + 1];
			count = 0;
			
			for(int j = 1; j <= N; j++) {
				graph[j] = new ArrayList<Integer>();
			}
			
			for(int j = 0; j < M; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				graph[x].add(y);
				graph[y].add(x);
			}
			
			dfs(1);
			System.out.println(count);
		}
	}
	
	public static void dfs(int node) {
		visited[node] = true;
		
		for(int next: graph[node]) {
			if(!visited[next]) {
				count++;
				dfs(next);
			}
		}
	}
}
