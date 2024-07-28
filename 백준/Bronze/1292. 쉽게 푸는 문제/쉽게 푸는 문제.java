import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int sum = 0;

        for(int i = 1; i <= B; i++){
            for(int j = 1; j <= i; j++){
                arr.add(i);
            }
        }

        for(int i = A-1; i <= B-1; i++){
            sum += arr.get(i);
        }
        System.out.println(sum);
        scanner.close();
    }
}