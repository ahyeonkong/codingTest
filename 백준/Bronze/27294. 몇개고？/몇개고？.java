import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int T = scanner.nextInt();
    int S = scanner.nextInt();
    
    if(S == 0 && T >= 12 && T <= 16)
    System.out.print(320);
    else System.out.print(280);
  }
}