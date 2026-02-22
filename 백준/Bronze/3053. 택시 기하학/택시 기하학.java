import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double R = sc.nextDouble();
		System.out.println(R*R*Math.PI+"\n"+2*R*R);
		sc.close();
	}

}
