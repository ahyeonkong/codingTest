import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int[] price = new int[9];

    sum = sc.nextInt();
    
    for(int i = 0; i < 9; i++){
      price[i] = sc.nextInt();
    }

    for(int i = 0; i < 9; i++){
      sum -= price[i];
    }

    System.out.println(sum);
  }
}