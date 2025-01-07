import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(bufferedReader.readLine());

        Integer[] maxArr = new Integer[K];
        Integer[] minArr = new Integer[K];
        Integer[] gapArr = new Integer[K];

        for(int i = 0; i < K; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int N = Integer.parseInt(stringTokenizer.nextToken());
            Integer[] arr = new Integer[N];
            int gap = 0;

            for(int j = 0; j < N; j++)
                arr[j] = Integer.parseInt(stringTokenizer.nextToken());
            Arrays.sort(arr, Collections.reverseOrder());

            for (int k = 0; k < arr.length - 1; k++)
                gap = Math.max(arr[k] - arr[k + 1], gap);

            maxArr[i] = arr[0];
            minArr[i] = arr[N-1];
            gapArr[i] = gap;
        }

        for(int l = 0; l < K; l++){
            System.out.println("Class " + (l+1));
            System.out.println("Max " + maxArr[l] + ", Min " + minArr[l] + ", Largest gap " + gapArr[l]);
        }
    }
}