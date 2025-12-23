package Lektion8;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Hangman {

    public static void main(String[] args) {
        String[] wortListe = {"PROGRAMMIERSPRACHE", "UZEBKISTAN", "LEKTION", "RATEN", "HANGMAN", "SPIEL", "AMERIKA", "EURO", "HAUS", "KATZE", "ZOO", "APFEL", "MAUS", "ZAHLEN", "GALGENMANN", "BEHOERDE", "OFEN", "LEON", "TUER", "JAVA"};
        boolean erraten = false;
        String outStriche = "";                                          //wandelt output direkt in String für printen
        Scanner scanner = new Scanner(System.in);
        int counter = 0;                                                 //zählt Versuche bis max. 15 hoch
        char[]aktuellesWort= waehleZufallsWort(wortListe);              //ruft Methode auf
        char[] aktuellesWortLeer = new char[aktuellesWort.length];
        char unterstrich = '_';

        for (int i = 0; i < aktuellesWort.length; i++) {                    //ersetzt die einzelnen Zellen des Arrays mit _
            aktuellesWortLeer[i] = unterstrich;
            outStriche += aktuellesWortLeer[i];
        }
            System.out.println(outStriche);
            do
            {                                                           //spiel Schleife bis 15 erreicht oder wort erraten
                System.out.println("Bitte geben Sie einen Buchstaben ein: ");
                char buchstabe = scanner.next().charAt(0);
                boolean richtigerBuchstabe = false;
                for (int i = 0; i < aktuellesWort.length; i++) {               //schleife um buchstaben zu vergleichen
                    if (buchstabe == aktuellesWort[i] || buchstabe == aktuellesWort[i]+32) {        //vergleicht ob Buchstabe im Array enthalten ist & +32 für ascii code Kleinbuchstabe
                        aktuellesWortLeer[i] = aktuellesWort[i];           //ersetzt aktuelle Stelle mit Buchstaben falls enthalten aus dem originalen Array damit Spiel gewonnen werden kann falls Kleinbuchstabe
                        richtigerBuchstabe = true;                      //hilfsvariable für den counter
                    }
                }
                System.out.println(aktuellesWortLeer);              //damit druck schöner aussieht und ich keine Arrays.to.String methode brauche
                if(Arrays.equals(aktuellesWortLeer, aktuellesWort)){
                    erraten = true;
                    System.out.println("Herzlichen Glückwunsch!");
                }
                if(!richtigerBuchstabe){                    //zählt hoch jedes mal wenn beim durchlauf die hilfsvariable falsch ist
                    counter++;
                }
            }
            while(!erraten && counter <15);

            if(!erraten){
                System.out.println("Du hast verloren!");
            }
    }
    public static char[] waehleZufallsWort(String[] liste){ //Methode um RandomWort auszuwählen
        Random randomZahl = new Random();
        int wortStelle=randomZahl.nextInt(liste.length);
        char[] aktuellesWort=liste[wortStelle].toCharArray();
        return aktuellesWort;
    }
}
