import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int T = Integer.parseInt(bufferedReader.readLine());
        int[][] dp = new int[15][15];

        for(int i = 1; i <= 14; i++){
            dp[0][i] = i; // 0층의 i호에는 i명이 거주
        }

        for(int i = 1; i <= 14; i++){
            for(int j = 1; j <= 14; j++){
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(bufferedReader.readLine());
            int n = Integer.parseInt(bufferedReader.readLine());
            stringBuilder.append(dp[k][n]).append("\n");  //k층 n호에 있는 사람 수 출력
        }
        System.out.print(stringBuilder);
    }
}