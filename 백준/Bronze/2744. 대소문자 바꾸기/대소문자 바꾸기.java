import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
    	String line = scanner.next();
    	char tmp;
    	String result = "";
    	
    	for(int i = 0; i < line.length(); i++) {
    		tmp = line.charAt(i);
    		
    		if(Character.isUpperCase(tmp))
    			result += Character.toLowerCase(tmp);
    		else
    			result += Character.toUpperCase(tmp);
    	}
    	System.out.println(result);
    	
    	scanner.close();
    }
}