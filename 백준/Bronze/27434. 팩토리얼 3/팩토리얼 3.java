import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(fact(1, N));
    }

    public static BigInteger fact(int a, int n) {
        BigInteger bigInteger = BigInteger.valueOf(a);

        if (a < n) {
            int b = (a + n) / 2;
            bigInteger = fact(a, b).multiply(fact(b + 1, n));
        }
        return bigInteger;
    }
}