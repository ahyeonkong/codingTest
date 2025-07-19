import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A == B)
            System.out.println("Anything");
        else if (A < B) System.out.print("Bus");
        else System.out.print("Subway");
    }
}