package Lektion5;
import java.util.Scanner;
public class PiNaeherung {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die Anzahl der Rechtecke ein: ");
        int n = scanner.nextInt();
        double breite = 1.0/n;
        double flaeche = 0;

        for (int i = 0; i<n; i++){

            double hoehe = Math.sqrt(1.0-(i*breite*i*breite));
            flaeche += hoehe*breite;
        }
        double pi = 4*flaeche;
        System.out.println(pi);
    }
}
