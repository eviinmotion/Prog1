package EigeneUebungen;
import java.util.Scanner;
public class KleinesEinmalEins {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welche Einmal-Eins-Reihe möchten Sie sehen? ");
        int nummer = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            int ergebnis = nummer * i;
            System.out.println(i +" * "+nummer+" = "+ergebnis);
        }
    }
}
