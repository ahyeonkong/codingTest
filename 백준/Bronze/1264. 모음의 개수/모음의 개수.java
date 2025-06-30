import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String line = scanner.nextLine();
            int count = 0;
            if(line.equals("#")) break;
            for(int i = 0; i < line.length(); i++){
                if(line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' || line.charAt(i) == 'o' || line.charAt(i) == 'u'
                || line.charAt(i) == 'A' || line.charAt(i) == 'E' || line.charAt(i) == 'I' || line.charAt(i) == 'O' || line.charAt(i) == 'U') count++;
            }
            System.out.println(count);
        }
    }
}