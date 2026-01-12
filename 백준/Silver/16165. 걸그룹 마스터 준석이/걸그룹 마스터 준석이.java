import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Map<String, String[]> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String tname = br.readLine();
			int count = Integer.parseInt(br.readLine());
			String[] member = new String[count];

			for (int j = 0; j < count; j++) {
				member[j] = br.readLine();
			}

			Arrays.sort(member);
			map.put(tname, member);
		}
		
		for(int i = 0; i < M; i++) {
			String mname = br.readLine();
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0)
				for(String member: map.get(mname)) {
					System.out.println(member);
				}
			else if(num == 1) { 
				for(String groupname: map.keySet()) {
					if(Arrays.asList(map.get(groupname)).contains(mname))
						System.out.println(groupname);
				}
			}
		}
		br.close();
	}
}
