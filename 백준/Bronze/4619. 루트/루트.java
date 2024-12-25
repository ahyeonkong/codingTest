import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        while(true){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int B = Integer.parseInt(stringTokenizer.nextToken());
            int N = Integer.parseInt(stringTokenizer.nextToken());
            int A = 1;

            while (Math.pow(A, N) <= B) {
                A++;
            }
            A--;

            if(B == 0 && N == 0) break;

            int diff1 = Math.abs(B - (int)Math.pow(A, N));
            int diff2 = Math.abs(B - (int)Math.pow(A + 1, N));

            if (diff1 <= diff2) {
                stringBuilder.append(A).append("\n");
            }
            else {
                stringBuilder.append(A + 1).append("\n");
            }
        }
        System.out.println(stringBuilder);
    }
}