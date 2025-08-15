import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        if (M % K == 0)
            System.out.println("Yes");
        else {
            System.out.println("No");
        }
    }
}
