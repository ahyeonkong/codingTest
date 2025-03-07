import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(findLargestGoldMinsu(N));
        sc.close();
    }

    public static int findLargestGoldMinsu(int N) {
        int num = N;
        while (num >= 4) {
            if (isGoldMinsu(num)) {
                return num;
            }
            num--;
        }
        return 0;
    }

    public static boolean isGoldMinsu(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit != 4 && digit != 7) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}