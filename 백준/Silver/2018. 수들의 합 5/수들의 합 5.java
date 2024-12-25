import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int count = 0;

        for(int i = 1; i <= N; i++){
            int sum = 0;
            for(int j = i; j <= N; j++){
                sum += j;
                if(sum > N)
                    break;
                else if(sum == N){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}