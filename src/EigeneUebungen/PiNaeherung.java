package EigeneUebungen;
import java.util.Scanner;
public class PiNaeherung {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die Anzahl der Rechtecke ein: ");
        int n = scanner.nextInt();
        double breite = 2.0/ n;
        double summeAllerHoehen = 0.0;

        for (int i = 0; i<n; i++){
            double xMitte = (i+0.5)*breite;
            double hoehe = Math.sqrt(4.0-xMitte*xMitte);
            summeAllerHoehen = summeAllerHoehen +hoehe;

        }
        double flaeche = summeAllerHoehen * breite;

        System.out.println("Die Näherung an Pi ist: "+flaeche);

    }
}
