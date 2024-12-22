import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String s = bufferedReader.readLine();
            StringBuilder stringBuilder = new StringBuilder(s);
            String sReverse = stringBuilder.reverse().toString().toString();

            if(s.equals("0")) break;
            if(s.equals(sReverse)) System.out.println("yes");
            else System.out.println("no");
        }
    }
}