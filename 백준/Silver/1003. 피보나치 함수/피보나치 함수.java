import java.util.Scanner;

public class Main {
    static int count0 = 0; static int count1 = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        int[] list = new int[T];

        for(int i = 0; i < T; i++)
            list[i] = scanner.nextInt();

        for(int i = 0; i < T; i++){
            fibonacci(list[i]);
            System.out.println(count0 + " " + count1);
            count0 = 0; count1 = 0;
        }
        scanner.close();
    }
    public static int fibonacci(int n) {
        int temp1 = 0;
        int temp2 = 1;
        int temp = 0;

        if (n == 0) {
            count0++;
            return 0;
        } else if (n == 1) {
            count1++;
            return 1;
        } else {
            for(int i = 1 ; i < n ; i++) {
                temp = temp1 + temp2;
                temp1 = temp2;
                temp2 = temp;
            }
            count0 = temp1;
            count1 = temp2;
        }
        return 0;
    }
}