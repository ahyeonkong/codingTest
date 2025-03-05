import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];

        for(int i = 0; i < 4; i++){
            arr[i] = scanner.nextInt();
        }

        if ((arr[0] == 8 || arr[0] == 9) &&
                (arr[3] == 8 || arr[3] == 9) &&
                (arr[1] == arr[2])) {
            System.out.print("ignore");
        } else {
            System.out.print("answer");
        }
        scanner.close();
    }
}