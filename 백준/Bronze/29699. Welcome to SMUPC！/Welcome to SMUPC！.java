import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arr = "WelcomeToSMUPC";
        int N = scanner.nextInt();

        if (N % 14 == 0) {
            System.out.println(arr.charAt(13));
        } else {
            System.out.println(arr.charAt((N - 1) % 14));
        }
    }
}
