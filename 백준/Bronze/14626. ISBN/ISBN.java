import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int idx = 0, sum = 0, c;

        for (int i = 0; i < line.length(); i++) {
            if ((c = line.charAt(i)) != '*')
                sum += i % 2 == 0 ? c - '0' : (c - '0') * 3;
            else
                idx = i;
        }

        int j;
        for (j = 0; j < line.length(); j++) {
            if (idx % 2 == 0 && (sum + j) % 10 == 0)
                break;
            else if (idx % 2 != 0 && (sum + 3 * j) % 10 == 0)
                break;
        }

        System.out.println(j);
    }
}