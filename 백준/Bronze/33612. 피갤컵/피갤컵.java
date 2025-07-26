import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int year = 2024;
        int month = 8;

        if (N == 1) {
            System.out.println(year + " " + month);
            return;
        }else{
            month += (7 * (N - 1));

            if(month % 12 != 0){
                year += month / 12;
                month = month % 12;
            }else{
                year += month / 12 - 1;
                month = 12;
            }
        }
        System.out.println(year + " " + month);
    }
}
