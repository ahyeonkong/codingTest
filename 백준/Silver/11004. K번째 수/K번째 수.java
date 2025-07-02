import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());
        int[] A = new int[N];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0; i < N; i++)
            A[i] = Integer.parseInt(stringTokenizer.nextToken());

        Arrays.sort(A);
        System.out.println(A[K-1]);
    }
}
