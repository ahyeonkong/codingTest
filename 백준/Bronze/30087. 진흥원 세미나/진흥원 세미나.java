import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i = 0; i < N; i++){
            String line = scanner.next();
            switch (line) {
                case "Algorithm": System.out.println("204"); break;
                case "DataAnalysis": System.out.println("207"); break;
                case "ArtificialIntelligence": System.out.println("302"); break;
                case "CyberSecurity": System.out.println("B101"); break;
                case "Network": System.out.println("303"); break;
                case "Startup": System.out.println("501"); break;
                case "TestStrategy": System.out.println("105"); break;
            }
        }
    }
}
