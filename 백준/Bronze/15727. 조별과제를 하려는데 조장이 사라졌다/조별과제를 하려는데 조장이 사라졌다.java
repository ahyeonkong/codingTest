import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int L = scanner.nextInt();

        if (L % 5 == 0)
            System.out.println(L/5);
        else
            System.out.println(L/5+1);
    }
}