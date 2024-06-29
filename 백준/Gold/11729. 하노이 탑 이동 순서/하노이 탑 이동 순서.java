import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		int N = scanner.nextInt();
		bufferedWriter.write((int) (Math.pow(2, N) - 1) + "\n");
		
		hanoi_tower(N, 1, 2, 3);
		
		scanner.close();

		bufferedWriter.flush();
		bufferedWriter.close();
	}
	/*
	 * 3 1 2 3
	 * 2 1 3 2
	 * 1 2 1 3
	 */
	public static void hanoi_tower(int n, int from, int tmp, int to) throws IOException {
		if(n == 1) {
			bufferedWriter.write(from+" "+to+" "+"\n");
			return;
		}
		else {
			hanoi_tower(n-1, from, to, tmp);
			bufferedWriter.write(from+" "+to+" "+"\n");
			hanoi_tower(n-1, tmp, from, to);
		}
	}
}