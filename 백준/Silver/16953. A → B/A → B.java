import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong(); // 시작 숫자 A
        long B = sc.nextLong(); // 목표 숫자 B

        Queue<long[]> queue = new LinkedList<>();
        // 큐에 [현재값, 연산횟수] 넣기
        queue.offer(new long[]{A, 1});

        while (!queue.isEmpty()) {
            long[] curr = queue.poll(); // 현재 상태 꺼내기
            long value = curr[0];       // 현재 숫자
            long count = curr[1];       // 지금까지 연산 횟수

            // 목표에 도달하면 연산 횟수 출력 후 종료
            if (value == B) {
                System.out.println(count);
                return;
            }

            // 다음 숫자가 B를 넘지 않으면 2배 연산 시도
            if (value * 2 <= B) {
                queue.offer(new long[]{value * 2, count + 1});
            }

            // 다음 숫자가 B를 넘지 않으면 오른쪽에 1 붙이기 연산 시도
            if (value * 10 + 1 <= B) {
                queue.offer(new long[]{value * 10 + 1, count + 1});
            }
        }

        // B에 도달할 수 없으면 -1 출력
        System.out.println(-1);
    }
}
