import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static Queue<Integer> queue = new LinkedList<>();
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		for(int i = 1; i <= N; i++) {
			enqueue(i);
		}
        while (queue.size() > 1) {
        	queue.poll();
        	queue.add(queue.poll());
        }
        System.out.println(queue.poll());
		
		scanner.close();
	}
	public static int poll() {
		return queue.poll();
	}
	public static void enqueue(int temp) {
		queue.add(temp);
	}
}
