import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] mList = new int[N];
        int count = 0;

        for(int i = 0; i < N; i++)
            mList[i] = scanner.nextInt();

        for(int i = N-1; i >= 0; i--){
            if(mList[i] <= K){
                count += K / mList[i];
                K %= mList[i];
            }
        }

        System.out.println(count);
        scanner.close();
    }
}