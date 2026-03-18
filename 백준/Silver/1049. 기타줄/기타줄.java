import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int minPack = Integer.MAX_VALUE;
		int minOne = Integer.MAX_VALUE;
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			minPack = Math.min(minPack, Integer.parseInt(st.nextToken()));
			minOne = Math.min(minOne, Integer.parseInt(st.nextToken()));
		}
		
		int sumOne = (N * minOne);
		int sumPackOne = ((N / 6) * minPack + (N % 6) * minOne);
		int sumPack = (N / 6 + 1) * minPack;
		System.out.println(Math.min(sumPackOne, Math.min(sumPack, sumOne)));
	}

}
