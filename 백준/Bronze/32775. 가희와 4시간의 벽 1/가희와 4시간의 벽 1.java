import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int F = scanner.nextInt();
        if (S > F)
            System.out.println("flight");
        else {
            System.out.println("high speed rail");
        }
    }
}
