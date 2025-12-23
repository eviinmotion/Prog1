package Lektion3;
import java.util.Scanner;
public class Matrikelnummer {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Geben Sie Ihre Matrikelnummer ein: ");
         int nummer = scanner.nextInt();

         if (nummer > 5099999 && nummer < 5199999) {
             System.out.println("Ihre Matrikelnummer ist richtig.");
         }
         else if (nummer > 6099999 && nummer < 6199999){
             System.out.println("Ihre Matrikelnummer ist richtig.");
         }
         else {
             System.out.println("Die Matrikelnummer ist ungültig.");
         }



    }
}
