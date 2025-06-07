import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    int num = 0;

    for(int i = 0; i < line.length(); i++){
      if(line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' || line.charAt(i) == 'o' || line.charAt(i) == 'u')
        num++;
    }
    System.out.println(num);
  }
}