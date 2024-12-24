import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(bufferedReader.readLine());
        String[] arr = new String[N];

        for(int i = 0; i < N; i++){
            arr[i] = bufferedReader.readLine();
        }

        for(int i = 0; i < N; i++){
            int count = 0;
            int answer = 0;

            for(int j = 0; j < arr[i].length(); j++){
                if(arr[i].charAt(j) == 'O'){
                    count++;
                    answer += count;
                }
                else {
                    count = 0;
                }
            }
            stringBuilder.append(answer).append('\n');
        }
        System.out.print(stringBuilder);
    }
}