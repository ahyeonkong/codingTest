import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        String line = scanner.next();
        int e = 0; int two = 0;

        for(int i = 0; i < s; i++){
            if(line.charAt(i) == '2')
                two++;
            else if(line.charAt(i) == 'e')
                e++;
        }

         if(two == e)
            System.out.println("yee");
        else if(two > e) System.out.println("2");
        else System.out.println("e");
    }
}