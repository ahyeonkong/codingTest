import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] burger = new int[3];
        int[] drink = new int[2];
        int burgerMax = Integer.MAX_VALUE; int drinkMax = Integer.MAX_VALUE;

        for(int i = 0; i < 3; i++){
            burger[i] = scanner.nextInt();

            if(burgerMax > burger[i]){
                burgerMax = burger[i];
            }
        }

        for(int i = 0; i < 2; i++){
            drink[i] = scanner.nextInt();

            if(drinkMax > drink[i]){
                drinkMax = drink[i];
            }
        }

        System.out.println(burgerMax+drinkMax-50);
        scanner.close();
    }
}