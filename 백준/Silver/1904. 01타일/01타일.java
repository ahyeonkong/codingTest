import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        int[] dp = new int[1000001];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        /*
            dp[3] = 3;
            dp[4] = 5;
            d[[5] = 8;
            dp[6] = 13;
        */

        for(int i = 3; i <= N; i++)
            dp[i] = (dp[i-2] + dp[i-1]) % 15746;

        System.out.println(dp[N]);
    }
}