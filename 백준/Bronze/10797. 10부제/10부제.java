import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[5];
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n)
                count++;
        }
        System.out.println(count);
    }
}
