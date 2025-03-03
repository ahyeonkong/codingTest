import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(bufferedReader.readLine());
        long sum = 0;
        int N = 0;

        for(int i = 1; ; i++){
            if(sum > S) break;
            sum += i;
            N++;
        }
        System.out.print(N-1);
    }
}