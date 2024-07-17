import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if(N == 1) System.out.println("SciComLove");
        else if(N == 2) System.out.println("SciComLove\nSciComLove");
    }
}