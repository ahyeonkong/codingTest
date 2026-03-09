import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < 3; i++) {
			String line = br.readLine();
			// 숫자로 들어올 때
			if(Character.isDigit(line.charAt(0))) {
				int num = Integer.parseInt(line);
				int next = num + (3 - i);
				
				if(next % 3 == 0 && next % 5 == 0) {
					System.out.println("FizzBuzz");
				}
				else if(next % 3 == 0 && !(next % 5 == 0)) {
					System.out.println("Fizz");
				}
				else if(!(next % 3 == 0) && next % 5 == 0) {
					System.out.println("Buzz");
				}
				else {
					System.out.println(next);
				}
				return;
			}
		}
	}
}
