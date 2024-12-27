import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if(x == 1 || x % 3 == 1) System.out.println("U");
        else if(x == 2 || x % 3 == 2) System.out.println("O");
        else System.out.println("S");
    }
}