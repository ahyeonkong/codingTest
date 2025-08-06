import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        boolean[] dp = new boolean[N+1];

        dp[1] = true;
        if(N >= 2) dp[2] = false;
        if(N >= 3) dp[3] = true;

        for(int i = 4; i <= N; i++){
            dp[i] = (!dp[i-1] || !dp[i-3]);
        }
        System.out.println(dp[N] ? "SK" : "CY");
    }
}
