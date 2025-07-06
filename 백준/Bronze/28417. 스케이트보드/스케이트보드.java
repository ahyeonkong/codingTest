import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int maxScore = 0;

        for (int i = 0; i < N; i++) {
            int[] r = new int[2];  // 런
            int[] t = new int[5];  // 트릭

            // 런 점수 입력
            for (int j = 0; j < 2; j++) {
                r[j] = scanner.nextInt();
            }

            // 트릭 점수 입력
            for (int j = 0; j < 5; j++) {
                t[j] = scanner.nextInt();
            }

            // 런 점수 중 큰 것 1개
            int runMax = Math.max(r[0], r[1]);

            // 트릭 점수 중 큰 2개
            Arrays.sort(t);
            int trickTop2 = t[3] + t[4];  // 오름차순 정렬이니까 뒤에서 2개

            int total = runMax + trickTop2;
            maxScore = Math.max(maxScore, total);
        }

        System.out.println(maxScore);
    }
}
