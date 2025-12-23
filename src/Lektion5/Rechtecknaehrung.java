package Lektion5;
import java.util.Scanner;
public class Rechtecknaehrung {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die Anzahl der Rechtecke ein die verwendet werden sollen: ");
        int n = scanner.nextInt();
        double breite = 1.0 / n;
        double summeAllerHoehen = 0.0;

        for (int i = 0; i < n; i++){
            double xMitte = (i+0.5)*breite;
            double hoehe = Math.sqrt(1.0-xMitte*xMitte);
            summeAllerHoehen = summeAllerHoehen +hoehe;
        }
        double flaeche = summeAllerHoehen*breite;
        double piwert = 4 * flaeche;
        System.out.println("Die Näherung an Pi ist: "+piwert);
    }
}
