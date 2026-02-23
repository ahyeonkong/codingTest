import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 1;
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double a = Double.parseDouble(st.nextToken());
			double b = Double.parseDouble(st.nextToken());
			double c = Double.parseDouble(st.nextToken());
			
			if(a == 0 && b == 0 && c == 0) break;
			
			System.out.println("Triangle #" + i);
			
			if(c == -1) {
				double cc = Math.sqrt(a * a + b * b);
				System.out.println("c = "+ String.format("%.3f", cc));
			}
			
			else if(b == -1) {
				if(c <= a) {
					System.out.println("Impossible.");
				}
				else {
					double bb = Math.sqrt(c * c - a * a);
					System.out.println("b = "+ String.format("%.3f", bb));
				}
			}
			
			else if(a == -1) {
				if(c <= b) {
					System.out.println("Impossible.");
				}
				else {
					double aa = Math.sqrt(c * c - b * b);				
					System.out.println("a = "+ String.format("%.3f", aa));
				}
			}
			
			System.out.println();
			i++;
		}
	}
}