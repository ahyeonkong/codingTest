// dp 문제...
import java.util.Scanner;
public class Main {
    static int dp[] = new int[11];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        int t = scanner.nextInt();

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int j = 4; j <= 10; j++) {
            dp[j] = dp[j-3] + dp[j-2] + dp[j-1]; // 점화식
        }

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            stringBuilder.append(dp[n]).append("\n");
        }

        System.out.print(stringBuilder);
        scanner.close();
    }
}