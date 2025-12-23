package Lektion3;

import java.util.Scanner;

public class gueltigeUhrzeit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Stundenzahl ein: ");
        int stundenzahl = scanner.nextInt();
        System.out.println("Geben Sie eine Minutenzahl ein: ");
        int minutenzahl = scanner.nextInt();
        System.out.println("Geben Sie eine Sekundenzahl ein: ");
        int sekundenzahl = scanner.nextInt();

        if (sekundenzahl > 59){
            minutenzahl = minutenzahl +1;
        }
        if (minutenzahl > 59 ){
           stundenzahl = stundenzahl + 1;

        }

        System.out.println("Die eingegebene Uhrzeit beträgt: "+stundenzahl+":"+minutenzahl+":"+sekundenzahl+" Uhr");
    }
}
