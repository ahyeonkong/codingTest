import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    	HashSet<String> set = new HashSet<String>();
    	String str = bufferedReader.readLine();
    	
    	for(int i = 0; i <= str.length(); i++) {
    		for(int j = i+1; j <= str.length(); j++)
    			set.add(str.substring(i ,j));
    	}
    	bufferedWriter.write(String.valueOf(set.size()));
    	
    	bufferedWriter.flush();
    	bufferedReader.close();
    	bufferedWriter.close();
    }
}