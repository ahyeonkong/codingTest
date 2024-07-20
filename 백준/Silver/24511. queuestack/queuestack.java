import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[N];
        Deque<Integer> deque = new ArrayDeque<>();

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(stringTokenizer.nextToken());
            if (arr[i] == 0)
                deque.addLast(num);
        }

        int M = Integer.parseInt(bufferedReader.readLine());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0; i < M; i++) {
            deque.addFirst(Integer.parseInt(stringTokenizer.nextToken()));
            bufferedWriter.write(deque.pollLast()+" ");
        }
        bufferedWriter.flush();
    }
}