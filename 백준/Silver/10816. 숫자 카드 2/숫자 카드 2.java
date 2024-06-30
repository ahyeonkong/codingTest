import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
	
public class Main{
	
	public static void main(String[] args) throws Exception{

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder stringBuilder = new StringBuilder();
		
		int N = Integer.parseInt(bufferedReader.readLine()); // 상근이가 가지고 있는 숫자 카드의 개수
		String[] numList = bufferedReader.readLine().split(" "); // 숫자 카드 정수 입력
		int[] cardList = new int[N];
		int tmp = 0;
		
		for(int i = 0; i < N; i++)
			cardList[i] = Integer.parseInt(numList[i]); // 숫자 카드에 적혀있는 정수
		
		Arrays.sort(cardList);
		
		int M = Integer.parseInt(bufferedReader.readLine()); // 상근이가 가지고 있는 숫자 카드의 개수
		numList = bufferedReader.readLine().split(" "); // 숫자 카드 정수 입력
		
		for(int i = 0; i < M; i++) {
			tmp = Integer.parseInt(numList[i]);  // 숫자 카드에 적혀있는 정수
			
			stringBuilder.append((upper(cardList, tmp) - lower(cardList, tmp))).append(' ');
		}
		
		System.out.println(stringBuilder);
		
		bufferedReader.close();
	}
	
	public static int lower(int[] arr, int a) {
		int start = 0;
		int end = arr.length;
		int mid;
		
		while(start < end) {
			mid = (start+end)/2;
			
			if(a <= arr[mid]) {
				end = mid;
			}else {
				start = mid + 1;
			}
		}
		
		return start;
	}
	
	public static int upper(int[] arr, int a) {
		
		int start = 0;
		int end = arr.length;
		int mid;
		
		while(start < end) {
			mid = (start+end)/2;
			
			if(a < arr[mid]) {
				end = mid;
			}else {
				start = mid + 1;
			}
		}
		
		return start;
	}
}
