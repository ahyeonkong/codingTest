import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		System.out.println(factorial(N));
		scanner.close();
	}
	
	public static long factorial(long n) {
		if(n==0 || n==1) return 1;
		else return n*factorial(n-1);
	}
	
}