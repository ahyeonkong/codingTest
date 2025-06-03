import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for(int i = 0; i < n; i++) {
			int K = scanner.nextInt();
			for(int j = 0; j < K; j++) {
				System.out.print("=");
			}
			System.out.println();
		}
		scanner.close();
	}
}