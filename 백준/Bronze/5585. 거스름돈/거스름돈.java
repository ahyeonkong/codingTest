import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int price = 1000-scanner.nextInt();
        int num = 0;
        while(price > 0){
            if(price / 500 > 0){
                num += price / 500;
                price %= 500;
            }
            else if(price / 100 > 0){
                num += price / 100;
                price %= 100;
            }
            else if(price / 50 > 0){
                num += price / 50;
                price %= 50;
            }
            else if(price / 10 > 0){
                num += price / 10;
                price %= 10;
            }
            else if(price / 5 > 0){
                num += price / 5;
                price %= 5;
            }
            else {
                num += price / 1;
                price = 0;
            }
        }
        System.out.println(num);
    }
}