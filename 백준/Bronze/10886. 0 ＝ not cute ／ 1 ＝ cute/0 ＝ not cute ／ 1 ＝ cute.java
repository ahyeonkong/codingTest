import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int count1 = 0; int count0 = 0;

        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(bufferedReader.readLine());
            if(n == 1) count1++;
            else if(n == 0) count0++;
        }
        if(count1 > count0) System.out.print("Junhee is cute!");
        else if(count1 < count0) System.out.print("Junhee is not cute!");
    }
}