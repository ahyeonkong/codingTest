import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
    	int score = 0;
    	int sum = 0;
    	
    	for(int i = 0; i < 5; i++) {
    		score = scanner.nextInt();
    		if(score >= 40) sum += score;
    		else
    			sum += 40;
    	}
    	
    	System.out.println(sum/5);
    	
    	scanner.close();
    }
}