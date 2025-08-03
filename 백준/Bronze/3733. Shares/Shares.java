import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int N = scanner.nextInt();
            int S = scanner.nextInt();
            System.out.println(S / (N+1));
        }
    }
}
