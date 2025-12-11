import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int[] arr = {300, 60, 10};
        int[] result = new int[arr.length];
        int T = Integer.parseInt(stringTokenizer.nextToken());

        for(int i = 0; i < result.length; i++){
            result[i] = T / arr[i];
            T %= arr[i];
        }
        if(T % 10 != 0) {
            System.out.println(-1);
        }else{
            for(int r: result)
                System.out.print(r + " ");
        }
    }
}