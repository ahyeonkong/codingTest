import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum1 = 0;
        int sum2= 0;
        int sum3 = 0;

        for(int i = 1; i <= N; i++)
            sum1 += i;
        System.out.println(sum1);

        sum2 = sum1 * sum1;
        System.out.println(sum2);

        for(int i = 1; i <= N; i++)
            sum3 += i * i * i;
        System.out.println(sum3);
    }
}
