import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= N; i++) {
			list.add(i);
		}
		
		while(!list.isEmpty()) {
			for(int i = 0; i < K-1; i++)
				list.add(list.poll());
			sb.append(list.poll());
			if(!list.isEmpty()) sb.append(", ");
		}
		System.out.println("<"+sb.toString()+">");
	}
}
