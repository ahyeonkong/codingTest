import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static boolean visited[];
	static int N, M, R;
	static ArrayList<Integer>[] list;
	static int result[];
	static int count = 1;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[N+1];
		visited = new boolean[N+1];
		result = new int[N+1];
		
		for(int i = 0; i < visited.length; i++) {
			result[i] = 0;
		}
		
		for(int i = 0; i < N+1; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < M; i++){
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list[x].add(y);
			list[y].add(x);
		}
		
		for(ArrayList<Integer> l: list) {
			Collections.sort(l);
		}
		
		bfs(R);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < result.length-1; i++) {
			sb.append(result[i]).append("\n");
		}
		sb.append(result[result.length-1]);
		System.out.println(sb);
	}
	public static void bfs(int r) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(r);
		visited[r] = true;
		result[r] = count;
		
		while(!queue.isEmpty()) {
			int x = queue.poll();
			for(int i: list[x]) {
				if(!visited[i]) {
					queue.offer(i);
					visited[i] = true;
					result[i] = ++count;
				}
			}
		}
	}
}
