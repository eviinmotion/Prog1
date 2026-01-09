package Lektion11;
import java.util.Scanner;

public class TageImMonat {
    public static int tageImMonat(String monat){
        int tage = switch(monat){
            case "Februar" -> 28;
            case "April", "Juni", "September", "November" -> 30;
            case "Januar", "März", "Mai", "Juli", "August", "Oktober", "Dezember" -> 31;
            default -> throw new RuntimeException("falscher Monatsname");
        };
        return tage;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean monatKorrekt = false;
        do{
            try {
                System.out.println("Bitte geben Sie einen Monat ein:");
                String inputMonat = input.nextLine();
                System.out.print(tageImMonat(inputMonat));
                monatKorrekt = true;
                }
            catch(RuntimeException e){
                System.out.println("Geben Sie einen gültigen Monat ein!");
            }
        }while(!monatKorrekt);

    }
}
