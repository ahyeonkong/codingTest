import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] arr = new String[N];

        for(int i = 0; i < N; i++){
            arr[i] = scanner.nextLine();
        }

        for(int i = 0; i < N; i++){
            System.out.println((i+1)+". "+arr[i]);
        }
        scanner.close();
    }
}