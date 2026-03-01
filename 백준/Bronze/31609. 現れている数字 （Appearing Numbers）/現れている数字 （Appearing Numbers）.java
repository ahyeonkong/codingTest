
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		TreeSet<Integer> set = new TreeSet<Integer>();
		StringBuilder sb = new StringBuilder();
		
		String line = br.readLine();
		if(line != null) {
			for(int i = 0; i < line.length(); i++) {
				char c= line.charAt(i);
				if(Character.isDigit(c)) {
					set.add(c - '0');
				}
			}
		}
		
		for(int s: set) {
			sb.append(s).append("\n");
		}
		System.out.println(sb);
	}

}
