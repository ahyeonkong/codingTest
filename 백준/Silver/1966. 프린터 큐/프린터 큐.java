import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for(int i = 0; i < T; i++) {
			int count = 0;
			LinkedList<Integer> priorityQueue = new LinkedList<>(); // 중요도 큐
			LinkedList<Integer> indexQueue = new LinkedList<>(); // 인덱스 큐
			
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				int num = Integer.parseInt(st.nextToken());
				priorityQueue.add(num); // 1 2 3 4: 중요도 값
				indexQueue.add(j); // 0 1 2 3: 인덱스
			}
			
			while(!priorityQueue.isEmpty()) {
				int currentPriority = priorityQueue.poll();
				int currentIndex = indexQueue.poll();
				boolean hasHigh = false;

				for(int j = 0; j < priorityQueue.size(); j++) {
					if(currentPriority < priorityQueue.get(j)) {
						hasHigh = true;
						break;
					}
				}
				
				if(hasHigh) {
					priorityQueue.add(currentPriority);
					indexQueue.add(currentIndex);
				}
				else {
					count++;
					if(currentIndex == M) {
						System.out.println(count);
						break;
					}
				}
			}
		}
	}
}
