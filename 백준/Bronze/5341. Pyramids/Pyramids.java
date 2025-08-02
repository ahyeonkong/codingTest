import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int N = scanner.nextInt();
            if (N == 0) break;
            System.out.println((N * (N+1))/2);
        }
    }
}