import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        for(int i=N-1; i>=0; i--){
            stack.push(Integer.parseInt(inputs[i]));
        }

        int order = 1;
        while(!stack.isEmpty()){
            int target = stack.peek();

            if(target == order){
                stack.pop();
                order++;
            }else{
                if(!temp.isEmpty()){
                    if(temp.peek() == order){
                        temp.pop();
                        order++;
                    }else{
                        temp.push(stack.pop());
                    }
                }else{
                    temp.push(stack.pop());
                }
            }
        }

        while(!temp.isEmpty()){
            if(temp.pop() == order){
                order++;
            }else{
                break;
            }
        }

        if(stack.isEmpty() && temp.isEmpty()){
            sb.append("Nice");
        }else{
            sb.append("Sad");
        }

        System.out.println(sb.toString());
        br.close();
    }
}
