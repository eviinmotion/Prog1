package Lektion3;
import java.util.Scanner;
public class Einzelzeichen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie ein Zeichen ein: ");

        if (scanner.hasNextInt(2)){
            int binary = scanner.nextInt(2);
            System.out.println("Es handelt sich um eine Binärzahl");
        }
        if (scanner.hasNextInt()){
            int zahl = scanner.nextInt();
            int moduloOktal = zahl % 8;
            int moduloHex = zahl % 16;

            if ((moduloOktal == 0) && (moduloHex == 0)){
                System.out.println("Es handelt sich um eine Hexadezimal- und eine Oktalzahl");
            }
            else if (moduloHex == 0){
                System.out.println("Es handelt sich um eine Hexadezimalzahl");
            }
            else if (moduloOktal == 0 ){
                System.out.println("Es handelt sich um eine Oktalzahl");
            }

            else {
                System.out.println("Es handelt sich um eine Zahl.");
            }
        }
        else {
            String buchstabe = scanner.nextLine();
            if (Character.isUpperCase(buchstabe.charAt(0))) {
                System.out.println("Es handelt sich um einen Großbuchstaben.");
            }
            else if (Character.isLowerCase(buchstabe.charAt(0))) {
                System.out.println("Es handelt sich um einen Kleinbuchstaben.");
            }
            else {
                System.out.println("Ungültig");
            }

        }


    }
}

