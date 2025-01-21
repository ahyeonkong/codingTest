import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        long N = Long.parseLong(stringTokenizer.nextToken());
        long M = Long.parseLong(stringTokenizer.nextToken());
        long sum = N;
        long temp = N;

        while (temp > 0) {
            temp /= M;
            sum += temp;
        }

        System.out.println(sum);
    }
}