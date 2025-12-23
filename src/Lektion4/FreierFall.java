package Lektion4;
import java.util.Scanner;
public class FreierFall {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie an wie lange Etwas fallen soll: ");
        int falldauer = scanner.nextInt();
        double fallgeschwindigkeit = 9.80665;

        for (int t = 1; t <= falldauer;t+=5){
            int tQuadrat = t*t;
            double strecke = 0.5 * fallgeschwindigkeit *(t*t);
            System.out.println("Zeit: "+t+"Sekunden: Zurückgelegte Strecke: "+strecke);
            Thread.sleep(5000);

        }

    }
}
