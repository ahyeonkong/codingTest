import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // 에라토스테네스의 체
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int M = Integer.parseInt(stringTokenizer.nextToken());
        int N = Integer.parseInt(stringTokenizer.nextToken());

        boolean[] arr = new boolean[N+1];
        arr[0] = arr[1] = true;

        for(int i = 2; i <= Math.sqrt(N+1); i++){
            for(int j = i * i; j < N+1; j += i){
                arr[j] = true; // 소수가 아님
            }
        }

        /*
            arr[4] = true;
            arr[6] = true;
            arr[8] = true;
            arr[10] = true;
            arr[12] = true;
            arr[9] = true;

            arr[5] = false;
            arr[7] = false;
            arr[11] = false;
            arr[13] = false
        */

        for(int k = M; k <= N; k++){
            if(!arr[k])
                System.out.println(k);
        }
    }
}