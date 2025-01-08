import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());

        dp[0] = arr[0];
        int max = dp[0];

        for(int i = 1; i < arr.length; i++){
            dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}