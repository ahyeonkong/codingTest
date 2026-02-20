import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int count = 0; 
		boolean check = false;
		
		String[] s = line.split(" ");
		
		for(int i = 0; i < s.length; i++) {
			for(int j = 0; j < s[i].length(); j++) {
				if(s[i].charAt(j) == '<') { // '<'일 때
					while(!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					check = true; // 검사
					sb.append(s[i].charAt(j)); // <
				}
				else if(s[i].charAt(j) == '>') { // '>'일 때
					check = false; // 검사
					sb.append(s[i].charAt(j));
				} 
				else if(check) {
					
					sb.append(s[i].charAt(j));
					continue;
				}
				else if(!check) { // tag -> gat
					stack.add(s[i].charAt(j));
				}
				else { // < > 안에 있는 open
					sb.append(s[i].charAt(j));
				}
			}
			while(!stack.isEmpty()) {
				sb.append(stack.pop());
			}
			sb.append(" ");
		}
		System.out.println(sb.toString());
	}
}
