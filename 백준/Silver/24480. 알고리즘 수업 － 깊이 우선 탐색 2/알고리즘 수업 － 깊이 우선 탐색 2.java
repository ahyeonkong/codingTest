import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	
	static boolean[] visited;
	static ArrayList<Integer>[] graph;
	static int[] answer; // 각 노드가 몇 번째 방문인지 저장
	static int order = 1; // 방문 순서

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList[N+1];
		visited = new boolean[N+1];
		answer = new int[N+1];
		
		// 정점		
		for(int i = 0; i <= N; i++) {
			graph[i] = new ArrayList<Integer>();
		}
		
		// 간선
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			// 양방향 간선
			graph[x].add(y);
			graph[y].add(x);
		}
		
		// 정점 내림차순
		for(int i = 0; i <= N; i++) {
			Collections.sort(graph[i], Collections.reverseOrder());
		}
		
		dfs(R);
		
		for(int i = 1; i <= N; i++) {
			System.out.println(answer[i]);
		}
		
	}
	
	public static void dfs(int node) {
		visited[node] = true;
		answer[node] = order;
		order++;
				
		// 다음 노드 탐색 
		for(int i = 0; i < graph[node].size(); i++) {
			int next = graph[node].get(i);
			if(!visited[next]) {
				dfs(next);
			}
		}
	}
}