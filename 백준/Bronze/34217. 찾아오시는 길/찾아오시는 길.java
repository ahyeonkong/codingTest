import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		if(A+C < B+D) {
			System.out.println("Hanyang Univ.");
		}
		else if(A+C == B+D) {
			System.out.println("Either");
		}
		else {
			System.out.println("Yongdap");
		}
	}
}
