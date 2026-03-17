import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/***
 * 투 포인터
 * 1. sum < M  → 구간을 오른쪽으로 확장 (end 증가)
 * 2. sum == M → 경우의 수 증가 후 왼쪽 축소 (start 증가)
 * 3. sum > M  → 합이 크므로 왼쪽 축소 (start 증가)
 */

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] A = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		int start = 0;
		int end = 0;
		int sum = A[0];
		int count = 0;
		
		while(true) {
			if(sum == M) {
				count++;
				sum -= A[start];
				start++;
			}
			else if(sum > M) {
				sum -= A[start];
				start++;
			}
			else if(sum < M) {
				end++;
				if(end == N) break;
				sum += A[end];
			}
		}
		System.out.println(count);
	}

}
