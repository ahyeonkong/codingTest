import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a=scanner.nextInt();
        int b=scanner.nextInt();

        if(a*(100-b)/100 >= 100.0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
}