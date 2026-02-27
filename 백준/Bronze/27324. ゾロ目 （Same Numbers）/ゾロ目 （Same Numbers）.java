import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N/10 == N-(N/10)*10) System.out.println(1);
		else System.out.println(0);
		sc.close();
	}
}
