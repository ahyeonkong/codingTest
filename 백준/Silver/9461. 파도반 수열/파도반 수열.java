import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			long[] dp = new long[N+1];
			
			// N >= 1이므로
			dp[0] = 0;
			if(N >= 1) dp[1] = 1;
			if(N >= 2) dp[2] = 1;
			if(N >= 3) dp[3] = 1;

			for(int j = 4; j < N+1; j++) {
				dp[j] = dp[j-3] + dp[j-2];
			}
			System.out.println(dp[N]);
		}
	}
}
