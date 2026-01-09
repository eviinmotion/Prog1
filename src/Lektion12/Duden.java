package Lektion12;
import java.util.Scanner;
public class Duden {
    public static void main(String[] args) {
        Knoten apfel = new Knoten("Apfel", "Frucht von einem Baum");
        Baum duden = new Baum(apfel);
        System.out.println("Willkommen zu meinem Wörterbuch!");
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte wählen Sie: " + "\n" + "1. Wort Einfügen" + "\n" + "2. Wort Suchen");
        int choice = input.nextInt();
        boolean fertig = false;
        do {
            if (choice == 1) {
                System.out.println("Bitte geben Sie das Wort ein, dass Sie einfügen möchten: ");
                String neuesWort = input.nextLine();
                System.out.println("Bitte geben Sie die Bedeutung ein: ");
                String bedeutung = input.nextLine();
                Knoten k = new Knoten(neuesWort, bedeutung);
                duden.insert(k);
            }
            if (choice == 2) {
                System.out.println("Bitte geben Sie das Wort ein, dass Sie suchen möchten: ");
                String neuesWort = input.nextLine();
                duden.search(neuesWort);
            } else {
                System.out.println("Falsche Eingabe!");
            }
            System.out.println("Möchten Sie eine weitere Änderung vornehmen?");
            String entscheidung = input.nextLine();
            if (entscheidung.equals("nein")) {
                fertig = true;
            } else {
                fertig = false;
            }
        } while (fertig == false);

    }
}
