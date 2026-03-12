import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < N; i++) {
			String line = sc.nextLine();
			if(line.length() >= 6 && line.length() <= 9)
				System.out.println("yes");
			else
				System.out.println("no");
		}
		sc.close();
	}

}
