import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Deque<int[]> deque = new ArrayDeque<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < N; i++){
            int[] array = {i+1, Integer.parseInt(stringTokenizer.nextToken())};
            deque.add(array);
        }

        while(deque.size()>1){
            int[] arr= deque.pollFirst();
            stringBuilder.append(arr[0]).append(" ");
            int n = arr[1];
            if(n>0) {
                for(int j=1; j<n;j++) {
                    deque.offerLast(deque.pollFirst());
                }
            }
            else if(n<0){
                for(int j=n;j!=0;j++) {
                    deque.offerFirst(deque.pollLast());
                }
            }
        }
        stringBuilder.append(deque.poll()[0]);

        bufferedWriter.write(stringBuilder+"\n");
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}