import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int min = 100;

        for(int i = 0; i < 7; i++){
            int N = Integer.parseInt(bufferedReader.readLine());
            if(N % 2 == 1){
                sum += N;
                min = Math.min(min, N);
            }
        }
        if(sum == 0)
            System.out.println(-1);
        else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}