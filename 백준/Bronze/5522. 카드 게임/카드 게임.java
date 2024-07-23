import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for(int j = 0; j < 5; j++){
            int i = scanner.nextInt();
            sum += i;
        }
        System.out.println(sum);
        scanner.close();
    }
}