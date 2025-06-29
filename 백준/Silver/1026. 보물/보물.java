import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int sum = 0;
        Integer[] A = new Integer[N];
        Integer[] B = new Integer[N];

        for(int i = 0; i < N; i++)
            A[i] = scanner.nextInt();

        for(int i = 0; i < N; i++)
            B[i] = scanner.nextInt();

        Arrays.sort(A);
        Arrays.sort(B, Collections.reverseOrder());

        for(int i = 0; i < N; i++){
            sum += A[i]*B[i];
        }
        System.out.println(sum);
    }
}