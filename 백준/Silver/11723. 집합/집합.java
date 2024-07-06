import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int M = scanner.nextInt();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < M; i++) {
            String calculation = scanner.next();
            int x = 0;

            switch (calculation) {
                case "add" :
                    x = scanner.nextInt();
                    set.add(x);
                    break;
                case "remove" :
                    x = scanner.nextInt();
                    set.remove(x);
                    break;
                case "check" :
                    x = scanner.nextInt();
                    if (set.contains(x))
                        stringBuilder.append("1\n");
                    else
                        stringBuilder.append("0\n");
                    break;
                case "toggle" :
                    x = scanner.nextInt();
                    if (set.contains(x))
                        set.remove(x);
                    else
                        set.add(x);
                    break;
                case "all" :
                    for (int k = 0; k < 20; k++) {
                        set.add(k + 1);
                    }
                    break;
                case "empty" :
                    set.clear();
                    break;
            }
        }

        System.out.print(stringBuilder.toString());
        scanner.close();
    }
}