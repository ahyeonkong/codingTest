import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int fake1 = -1, fake2 = -1;
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    fake1 = i;
                    fake2 = j;
                    break;
                }
            }
            if (fake1 != -1) break;
        }

        int[] result = new int[7];
        int idx = 0;
        for (int i = 0; i < 9; i++) {
            if (i == fake1 || i == fake2) continue;
            result[idx++] = arr[i];
        }

        Arrays.sort(result);
        for (int i = 0; i < 7; i++) {
            System.out.println(result[i]);
        }
    }
}
