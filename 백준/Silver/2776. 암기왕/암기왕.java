import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
            StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(bufferedReader.readLine());
            HashSet<Integer> hashSet = new HashSet<>();

            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            for(int j = 0; j < N; j++){
                int num1 = Integer.parseInt(stringTokenizer.nextToken());
                hashSet.add(num1);
            }

            int M = Integer.parseInt(bufferedReader.readLine());
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for(int j = 0; j < M; j++){
                int num2 = Integer.parseInt(stringTokenizer.nextToken());
                if(hashSet.contains(num2)) stringBuilder.append(1).append("\n");
                else stringBuilder.append(0).append("\n");
            }
        }
        System.out.print(stringBuilder);
    }
}