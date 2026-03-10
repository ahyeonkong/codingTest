import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
/*
 * 1. 그래프 만들기
 * 2. 인접 리스트 정렬
 * 3. DFS 수행
 * 4. 방문 순서 출력
 */

public class Main {
	static boolean[] visited;
	static ArrayList<Integer>[] graph; // 인접 리스트 
	static int[] answer; // 각 노드가 몇 번째 방문인지 저장
	static int order = 1; // 방문 순서
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 정점의 수
		int M = Integer.parseInt(st.nextToken()); // 간선의 수
		int R = Integer.parseInt(st.nextToken()); // 시작 정점
		
		graph = new ArrayList[N + 1];
		visited = new boolean[N + 1];
		answer = new int[N + 1];
		
		for(int i = 0; i <= N; i++) {
			graph[i] = new ArrayList<>();
		}

		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			graph[x].add(y);
			graph[y].add(x);
		}
		
		for(int i = 0; i <= N; i++) {
			Collections.sort(graph[i]);
		}
		
		dfs(R);
		
		for(int i = 1; i <= N; i++) {
			System.out.println(answer[i]);
		}
		
	}
	
	public static void dfs(int R) {
		visited[R] = true; // 현재 노드 방문 처리
		answer[R] = order; // 방문 순서 기록
		order++; // 순서 증가
		
		// 연결된 노드 탐색
		// 다음 노드 선택
		for(int i = 0; i < graph[R].size(); i++) {
			int next = graph[R].get(i);
			if(!visited[next]) {
				dfs(next);
			}
		}
	}
}
