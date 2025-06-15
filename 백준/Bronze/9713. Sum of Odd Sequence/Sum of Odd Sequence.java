import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        for(int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            int sum = 0;
            
            for(int j = 1; j <= num; j += 2) {
                sum += j;
            }
            
            System.out.println(sum);
        }
        scanner.close();
    }
}