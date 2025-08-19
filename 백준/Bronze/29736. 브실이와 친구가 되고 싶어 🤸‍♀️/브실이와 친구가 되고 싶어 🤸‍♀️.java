import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int K = scanner.nextInt();
        int X = scanner.nextInt();
        int people = 0;

        for(int i = K-X; i < K+X+1; i++){
            if(i < A || i > B) continue;
            people++;
        }
        if (people == 0) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(people);
        }
    }
}
