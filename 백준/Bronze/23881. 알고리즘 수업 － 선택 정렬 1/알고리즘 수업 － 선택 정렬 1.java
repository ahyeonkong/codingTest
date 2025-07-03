import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int cnt = 0;

        // 선택 정렬: 최댓값을 뒤로 보내는 방식
        for (int i = n - 1; i > 0; i--) {
            int maxIdx = 0;
            for (int j = 1; j <= i; j++) {
                if (a[j] > a[maxIdx]) {
                    maxIdx = j;
                }
            }
            if (a[i] != a[maxIdx]) {
                int temp = a[i];
                a[i] = a[maxIdx];
                a[maxIdx] = temp;
                cnt++;
                if (cnt == k) {
                    int first = Math.min(a[i], a[maxIdx]);
                    int second = Math.max(a[i], a[maxIdx]);
                    System.out.println(first + " " + second);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
