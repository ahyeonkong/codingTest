import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		int max = 0;
		
		for(int i = 0; i < N; i++) {
			stack.push(Integer.parseInt(br.readLine()));
			if(max < stack.peek()) {
				max = stack.peek();
			}
		}

		int target = 0;
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			int pop = stack.pop();
			if(target < pop) {
				target = pop;
				count++;
			}
			if(pop == max)
				break;
		}
		System.out.println(count);
	}

}