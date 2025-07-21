import java.util.Scanner;

public class Main {
    static int A, P;
    static int[] order = new int[1000000];  // 등장 순서 저장
    static int repeatStartOrder = 0;        // 반복 시작 순서 저장 (초기값 0)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        A = scanner.nextInt();
        P = scanner.nextInt();

        DFS(A, 1);

        // 반복 시작 순서 - 1 이 정답
        System.out.println(repeatStartOrder - 1);
    }

    static void DFS(int num, int orderCount) {
        if (order[num] != 0) {
            // 이미 방문했으니 반복 시작 수 발견
            // 현재 만난 수의 방문 순서를 기록
            repeatStartOrder = order[num];
            return;
        }

        order[num] = orderCount;

        int next = getNext(num);

        DFS(next, orderCount + 1);
    }

    static int getNext(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, P);
            num /= 10;
        }
        return sum;
    }
}
