import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] S = new int[4];
        for(int i = 0; i < 4; i++){
            S[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] T = new int[4];
        for(int i = 0; i < 4; i++){
            T[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < S.length; i++){
            sum1 += S[i];
        }
        for(int i = 0; i < T.length; i++){
            sum2 += T[i];
        }

        System.out.println(sum1 > sum2 ? sum1 : sum2);
    }
}