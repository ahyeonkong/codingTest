import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(stringTokenizer.nextToken());
            hashMap.put(num, 1);
        }

        int M = Integer.parseInt(bufferedReader.readLine());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0; i < M; i++){
            int num = Integer.parseInt(stringTokenizer.nextToken());
            stringBuilder.append(hashMap.containsKey(num) ? 1 : 0).append("\n");
        }
        System.out.print(stringBuilder);
    }
}