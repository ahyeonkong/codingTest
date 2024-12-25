import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        String s = stringTokenizer.nextToken();

        if(s.equals("N") || s.equals("n")) System.out.println("Naver D2");
        else System.out.println("Naver Whale");
    }
}