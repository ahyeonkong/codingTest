import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int k, m = 0;

        if(A % C != 0)
            k = A / C + 1;
        else k = A / C;
        if(B % D != 0)
            m = B / D + 1;
        else m = B / D;
        System.out.println(L - Math.max(k, m));
    }
}
