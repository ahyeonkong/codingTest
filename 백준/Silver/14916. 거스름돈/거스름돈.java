import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] dp = new int[n + 1];

        if (n < 1) {
            System.out.println(-1);
            return;
        }
        dp[1] = -1;
        if(n >= 2) dp[2] = 1;
        if(n >= 3) dp[3] = -1;
        if(n >= 4) dp[4] = 2;
        if(n >= 5) dp[5] = 1;

        /*
        dp[6] = 3;
        dp[7] = 2;
        dp[8] = 4;
        dp[9] = 3;
        dp[10] = 2;
        dp[11] = 4;
        dp[12] = 3;
        dp[13] = 5;
        dp[14] = 4;
        */

        if(n >= 6){
            for (int i = 6; i <= n; i++) {
                if (dp[i-2] == -1 && dp[i-5] == -1) {
                    dp[i] = -1;
                } else if (dp[i-2] == -1) {
                    dp[i] = dp[i-5] + 1;
                } else if (dp[i-5] == -1) {
                    dp[i] = dp[i-2] + 1;
                } else {
                    dp[i] = Math.min(dp[i-2], dp[i-5]) + 1;
                }
            }
        }
        System.out.println(dp[n]);
    }
}