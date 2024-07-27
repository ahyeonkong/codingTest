import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        long n = Long.parseLong((stringTokenizer.nextToken()));
        long m = Long.parseLong((stringTokenizer.nextToken()));

        System.out.println(Math.abs(n-m));
        bufferedReader.close();
    }
}