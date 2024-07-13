import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] list = new int[N+1];

        for(int a = 1; a <= N;a++){ // 1~5 누적합 구하기
            list[0] = 0;
            list[a] = list[a-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for(int b = 1; b <= M; b++){ // 1~3
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(list[j] - list[i-1]);
        }
        bufferedReader.close();
    }
}