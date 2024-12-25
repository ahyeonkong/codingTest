import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());
        int[][] arr = new int[N][N];

        for(int i = 0; i < N; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for(int j = 0; j < N; j++)
                arr[i][j] = Integer.parseInt(stringTokenizer.nextToken());
        }

        for(int i = 0; i < N; i++){
            for(int k = 0; k < K; k++){
                for(int j = 0; j < N; j++) {
                    for (int l = 0; l < K; l++) {
                        stringBuilder.append(arr[i][j]).append(" ");
                    }
                }
                stringBuilder.append("\n");
            }
        }
        System.out.print(stringBuilder);
    }
}