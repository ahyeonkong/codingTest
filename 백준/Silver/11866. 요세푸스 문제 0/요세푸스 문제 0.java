import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++)
            queue.add(i);

        System.out.print("<");
        while (queue.size() > 1) {
            for (int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll());
            }
            stringBuilder.append(queue.poll()).append(", ");
        }

        stringBuilder.append(queue.poll()).append(">");
        System.out.println(stringBuilder);
        scanner.close();
    }
}