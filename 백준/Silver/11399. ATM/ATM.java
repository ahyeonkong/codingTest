import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0; int sumResult = 0;
        int[] lineList = new int[N];

        for(int i = 0; i < N; i++) {
            lineList[i] = scanner.nextInt();
        }

        Arrays.sort(lineList);
        for(int i = 0; i < N; i++) {
            sum += lineList[i];
            sumResult += sum;
        }

        System.out.println(sumResult);
        scanner.close();
    }
}