package EigeneUebungen;
import java.util.Scanner;
public class SummenRechner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein: ");
        int zahl = scanner.nextInt();
        int summe = 0;

        for (int i = 1; i <= zahl; i++){
            summe = summe +i;

        }
        System.out.println("Die Summe aller Zahlen von 1 bis "+zahl+" ist "+ summe);
    }
}
