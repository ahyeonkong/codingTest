import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            int c = Integer.parseInt(stringTokenizer.nextToken());

            if(a == 0 && b == 0 && c == 0) break;

            if(a * a == (b * b + c * c)) System.out.println("right");
            else if(b * b == (a * a + c * c)) System.out.println("right");
            else if(c * c == (a * a + b * b)) System.out.println("right");
            else System.out.println("wrong");
        }
    }
}