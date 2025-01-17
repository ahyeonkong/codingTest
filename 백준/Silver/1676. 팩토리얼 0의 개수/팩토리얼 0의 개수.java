import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int count = 0;

        for(int i = 1; i <= N; i++){
            int num = i;
            while(num % 5 == 0){
                count++;
                num /= 5;
            }
        }
        System.out.print(count);
    }
}