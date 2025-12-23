package EigeneUebungen;
import java.util.Scanner;
public class Tuersteher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Wie alt bist du?");
            int alterVolljaehrig = scanner.nextInt();

            if (alterVolljaehrig >= 18) {
                System.out.println("Willkommen im Club!");
                System.exit(0);
            } else {
                System.out.println("Du bist zu jung.");

            }
        }

    }
}