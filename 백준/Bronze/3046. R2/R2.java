import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R1 = scanner.nextInt();
        int S = scanner.nextInt();

        System.out.println(2 * S - R1);
    }
}