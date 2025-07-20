import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T1 = scanner.nextInt();
        int T2 = scanner.nextInt();

        System.out.println(Math.min(T1, T2));
    }
}