import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();
		
		// 6이 있는 걸 모두 5로 바꾸는 게 최소값
		// 5가 있는 걸 모두 6으로 바꾸는 게 최대값
		
		A = A.replace("6", "5");
		B = B.replace("6", "5");
		
		int min = Integer.valueOf(A) + Integer.valueOf(B);
		
		A = A.replace("5", "6");
		B = B.replace("5", "6");
		
		int max = Integer.valueOf(A) + Integer.valueOf(B);
		
		System.out.println(min + " " +max);
	}

}
