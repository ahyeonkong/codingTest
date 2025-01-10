import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int count1 = 0;
    static int count2 = 0;

    public static int fib(int n){
        if(n == 1 || n == 2){
            count1++;
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public static void fibonacci(int n) {
        int[] f = new int[n+1];
        f[1] = f[2] = 1;
        for(int i = 3; i <= n; i++){
            count2++;
            f[i] = f[i-1] + f[i-2];
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        fib(n);
        fibonacci(n);
        System.out.println(count1 + " " + count2);
    }
}