import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> map = new HashMap<>(); // 값, 빈도수
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int sum = 0;
		int a; int b; int c; int d;
		
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		for(int i = 0; i < N; i++) {
			sum += arr[i];
		}
		
		int max = 0;		
		for(int i = 0; i < N; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		
		for(int f: map.values()) {
			max = Math.max(max, f);
		}
		
		List<Integer> arrList = new ArrayList<>();
		for(int key: map.keySet()) {
			if(map.get(key) == max) {
				arrList.add(key);
			}
		}
		
		Collections.sort(arrList);
		
		if(arrList.size() > 1) {
			c = arrList.get(1);
		}else {
			c = arrList.get(0);
		}
		
		a = (int)(Math.round((double)sum / N));
		b = arr[N / 2];
		d = arr[N-1] - arr[0];
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}