import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int N = Integer.parseInt(stringTokenizer.nextToken());
            int M = Integer.parseInt(stringTokenizer.nextToken());

            if(N == 0 && M == 0) break;

            HashMap<Integer, Integer> hashMap = new HashMap<>();
            int count = 0;

            for(int i = 0; i < N; i++) {
                int cd = Integer.parseInt(bufferedReader.readLine());
                hashMap.put(cd, hashMap.getOrDefault(cd, 0) + 1);
            }

            for(int j = 0; j < M; j++){
                int cd = Integer.parseInt(bufferedReader.readLine());
                if(hashMap.containsKey(cd)) count++;
            }

            System.out.println(count);
        }
    }
}