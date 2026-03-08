import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int d = sc.nextInt();
        int count = 0;
        
        for (int i = 1; i <= n; i++) {
            int num = i;
            while (num > 0) {
                if (num % 10 == d) {
                    count++;
                }
                num /= 10;
            }
        }
        System.out.println(count);
        sc.close();
    }
}