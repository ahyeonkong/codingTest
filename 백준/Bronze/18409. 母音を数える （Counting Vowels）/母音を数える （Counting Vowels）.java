import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); sc.nextLine();
		String line = sc.nextLine();
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			if(line.charAt(i) == 'a' || line.charAt(i) == 'i' ||
			   line.charAt(i) == 'u' || line.charAt(i) == 'e' || line.charAt(i) == 'o') {
				count++;
			}
		}
		System.out.println(count);
		
		sc.close();
	}

}
