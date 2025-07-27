import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int index = 0;
        int n = line.length() / 10;
        for(int i = 0; i < n; i++){
            System.out.println(line.substring(index, index + 10));
            index += 10;
        }
        n = line.length() % 10;
        System.out.println(line.substring(line.length()-n));

    }
}
