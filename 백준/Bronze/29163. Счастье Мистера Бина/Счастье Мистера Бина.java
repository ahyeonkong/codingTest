import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int oddCount = 0; // 홀
		int evenCount = 0; // 짝
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i] % 2 == 0) evenCount++;
			else if(arr[i] % 2 != 0) oddCount++;
		}
		if(oddCount < evenCount) {
			System.out.println("Happy");
		}
		else {
			System.out.println("Sad");
		}
	}
}