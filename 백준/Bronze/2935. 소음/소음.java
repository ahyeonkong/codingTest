import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BigInteger A = new BigInteger(bufferedReader.readLine());
        String op = bufferedReader.readLine();
        BigInteger B = new BigInteger(bufferedReader.readLine());

        if(op.equals("+")) System.out.println(A.add(B));
        else if(op.equals("*")) System.out.println(A.multiply(B));
    }
}