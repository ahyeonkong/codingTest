import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(bufferedReader.readLine());
            long[] dp = new long[N + 1];

            dp[0] = 0L;
            if(N > 0) dp[1] = 1L;
            if(N > 1) dp[2] = 1L;

            /*
                dp[3] = 2;
                dp[4] = 2;
                dp[5] = 3;
                dp[6] = 4;
                dp[7] = 5;
            */

            for(int j = 3; j <= N; j++){
                dp[j] = dp[j-3] + dp[j-2];
            }
            System.out.println(dp[N]);
        }
    }
}