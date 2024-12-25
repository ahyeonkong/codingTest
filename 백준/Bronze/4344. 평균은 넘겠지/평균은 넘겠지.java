import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i < C; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int N = Integer.parseInt(stringTokenizer.nextToken());
            double avg = 0;
            double student = 0;
            int[] arr = new int[N];
            for(int j = 0; j < N; j++){
                arr[j] = Integer.parseInt(stringTokenizer.nextToken());
                avg += arr[j];
            }
            avg /= N;
            for(int j = 0; j < N; j++){
                if(arr[j] > avg)
                    student++;
            }
            student /= N;
            student *= 100;
            String s = String.format("%.3f", student);
            System.out.print(s+"%\n");
        }
    }
}