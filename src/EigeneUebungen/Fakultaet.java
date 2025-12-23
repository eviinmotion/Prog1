package EigeneUebungen;
import java.util.Scanner;
public class Fakultaet {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein: ");
        int zahl = scanner.nextInt();
        int summe = 1;
        for (int i = 1; i <= zahl; i++){
            summe = summe*i;

        }
        System.out.println("Die Fakultaet von " + zahl+" ist "+summe);


    }
}
