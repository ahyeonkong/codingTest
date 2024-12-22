import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int[][] time = new int[N][2];
        int count = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            time[i][0] = Integer.parseInt(stringTokenizer.nextToken()); // 시작 시간
            time[i][1] = Integer.parseInt(stringTokenizer.nextToken()); // 종료 시간
        }

        /*
            오름차순 정렬
            Comparator 인터페이스 사용
            또는 람다식 Arrays.sort(time, (a, b) -> a[0] - b[0]);
        */

        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int[] t : time) {
            while (!priorityQueue.isEmpty() && priorityQueue.peek() <= t[0]) {
                priorityQueue.poll();
            }
            priorityQueue.offer(t[1]);
            count = Math.max(count, priorityQueue.size());
        }

        System.out.println(count);
    }
}