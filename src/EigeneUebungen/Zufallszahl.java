package EigeneUebungen;
import java.util.Random;
import java.util.Scanner;
public class Zufallszahl {
    public static void main(String[] args){
        Random rand = new Random();
        System.out.println("Willkommen beim Ratespiel!");
        Scanner scanner = new Scanner(System.in);
        int zufallszahl = rand.nextInt(100)+1;

        int tipp;
        do {
            System.out.println("Was ist dein Tipp?");
            tipp = scanner.nextInt();

            if(tipp > zufallszahl) {
                System.out.println("Zu groß!");
            }
            else if(tipp < zufallszahl){
                System.out.println("Zu klein!");
            }
            else if(tipp == zufallszahl){
                System.out.println("Herzlichen Glückwunsch!");

            }
        }
        while(tipp != zufallszahl);




    }
}
