import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String line = sb.append(sc.nextLine()).reverse().toString();
		System.out.println(line);
		sc.close();
	}

}
