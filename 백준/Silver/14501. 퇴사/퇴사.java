import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		int[] T = new int[N+2];
		int[] P = new int[N+2];
		int[] dp = new int[N+2];
		T[0] = 0; P[0] = 0; dp[0] = 0;
		
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			T[i] = Integer.parseInt(st.nextToken());
			P[i] = Integer.parseInt(st.nextToken());
		}
		
		// 뒤에서부터 판단
		for(int i = N; i >= 1; i--) {
			int nextDay = T[i] + i;
			if(nextDay <= N + 1) {
				dp[i] = Math.max(P[i] + dp[nextDay], dp[i + 1]);
			}
			else {
				dp[i] = dp[i+1];
			}
		}
		
		System.out.println(dp[1]);
	}
}