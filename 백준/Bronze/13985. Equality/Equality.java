import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int a = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer.nextToken();
        int b = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer.nextToken();
        int c = Integer.parseInt(stringTokenizer.nextToken());

        if (a + b == c) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}