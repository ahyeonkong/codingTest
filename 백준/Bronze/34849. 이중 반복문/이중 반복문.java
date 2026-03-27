import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		if(N * N <= 100000000) {
			System.out.println("Accepted");
		}
		else {
			System.out.println("Time limit exceeded");
		}
		sc.close();
	}

}
