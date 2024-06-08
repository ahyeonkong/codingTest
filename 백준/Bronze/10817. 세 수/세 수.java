import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int[] arr = {A, B, C};
		
		Arrays.sort(arr);
		
		System.out.println(arr[1]);		

		scanner.close();
	}
}
