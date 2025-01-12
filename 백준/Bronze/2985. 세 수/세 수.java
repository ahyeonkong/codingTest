import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        int c = Integer.parseInt(stringTokenizer.nextToken());

        boolean isAnswer = true;

        while(isAnswer){
            if(a + b == c || a == b + c) {
                if(a + b == c) System.out.print(a+"+"+b+"="+c);
                else System.out.print(a+"="+b+"+"+c);
                break;
            }
            else if(a - b == c || a == b - c) {
                if(a - b == c) System.out.print(a+"-"+b+"="+c);
                else System.out.print(a+"="+b+"-"+c);
                break;
            }
            else if(a * b == c || a == b * c) {
                if(a * b == c) System.out.print(a+"*"+b+"="+c);
                else System.out.print(a+"="+b+"*"+c);
                break;
            }
            else if(a / b == c || a == b / c) {
                if(a / b == c) System.out.print(a+"/"+b+"="+c);
                else System.out.print(a+"="+b+"/"+c);
                break;
            }
            else isAnswer = false;
        }
    }
}