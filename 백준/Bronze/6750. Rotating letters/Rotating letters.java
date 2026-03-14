import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split("");
		boolean possible = true;
		
		for(String l: line) {
			if(!(l.equals("I") || l.equals("O") || l.equals("S") 
				|| l.equals("H") || l.equals("Z") 
				|| l.equals("X") || l.equals("N"))) {
				possible = false;
				break;
			}
		}
		if(possible) {
			System.out.println("YES");
		}
		else
			System.out.println("NO");
		sc.close();
	}

}
