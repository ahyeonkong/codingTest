import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n12 = scanner.nextInt();

        System.out.println((n1+1)*(n2+1)/(n12+1)-1);
    }
}
