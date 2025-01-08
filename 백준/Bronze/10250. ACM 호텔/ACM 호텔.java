import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        int answer = 0;

        for(int i = 0; i < T; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int H = Integer.parseInt(stringTokenizer.nextToken());
            int W = Integer.parseInt(stringTokenizer.nextToken());
            int N = Integer.parseInt(stringTokenizer.nextToken());


            if(N % H == 0)
                answer = H * 100 + (N / H);
            else
                answer = (N % H) * 100 + (N / H) + 1;
            System.out.println(answer);
        }
    }
}