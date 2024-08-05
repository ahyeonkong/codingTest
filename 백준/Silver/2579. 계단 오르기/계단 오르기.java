// dp 문제...
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[num+1];
        int[] dp = new int[num+1];

        for(int i = 1; i <= num; i++){
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }

        dp[0]=0;
        dp[1]=arr[1];
        
        if(num>=2)
            dp[2]=arr[1]+arr[2];

        for(int i = 3; i <= num; i++) {
            dp[i] = Math.max(dp[i-2], dp[i-3] + arr[i-1]) + arr[i];
        }

        bufferedWriter.write(String.valueOf(dp[num]));

        bufferedWriter.flush();
        bufferedReader.close();
        bufferedWriter.close();
    }
}