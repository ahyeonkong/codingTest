import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int A = Integer.parseInt(stringTokenizer.nextToken());
        int B = Integer.parseInt(stringTokenizer.nextToken());
        int C = gcd(A, B);

        System.out.println(C);
        System.out.println(A*B/C);
    }

    //유클리드 호제법으로 최대 공약수 구하기
    public static int gcd(int p, int q) {
        if (q == 0)
            return p;
        return gcd(q, p%q);
    }
}