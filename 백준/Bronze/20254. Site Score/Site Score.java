import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int ur = Integer.parseInt(stringTokenizer.nextToken());
        int tr = Integer.parseInt(stringTokenizer.nextToken());
        int uo = Integer.parseInt(stringTokenizer.nextToken());
        int to = Integer.parseInt(stringTokenizer.nextToken());

        System.out.println(56*ur+24*tr+14*uo+6*to);
    }
}