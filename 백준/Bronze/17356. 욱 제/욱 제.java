import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float A = scanner.nextFloat();
        float B = scanner.nextFloat();
        float M = (B-A)/400;

        System.out.println(1 / (1 + Math.pow(10, M)));
    }
}