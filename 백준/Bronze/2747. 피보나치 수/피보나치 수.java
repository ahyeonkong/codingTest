import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bufferedReader.readLine());
		int[] arr = new int[n+1];
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i = 2; i < n+1; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		System.out.println(arr[n]);
		
		bufferedReader.close();
		bufferedWriter.flush();
		bufferedWriter.close();
	}
}
