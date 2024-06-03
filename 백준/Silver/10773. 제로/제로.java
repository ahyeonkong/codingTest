import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int[] stack = new int[k];
		int num = 0; int sum = 0; int top = -1;
		
		for(int i = 0; i < k; i++) {
			num = scanner.nextInt();
			if(num == 0) {
				top--;
			}
			else {
				top++;
				stack[top] = num;
			}
		}
		for(int i = 0; i <= top; i++)
			sum += stack[i];
		System.out.println(sum);
		scanner.close();
	}
}