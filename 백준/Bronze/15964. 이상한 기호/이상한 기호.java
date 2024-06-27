import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
    	int A = 0; int B = 0;
    	
    	A = scanner.nextInt();
    	B = scanner.nextInt();
    	
    	System.out.println((A+B)*(A-B));
    	
    	scanner.close();
    }
}