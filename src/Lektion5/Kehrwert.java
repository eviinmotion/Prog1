package Lektion5;
import java.util.Scanner;
public class Kehrwert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kehrwert;
        int a;
        int b;
        do{
            System.out.println("Bitte geben Sie den Zähler ein: ");
            a = scanner.nextInt();
            if(a == 0){
                System.out.println("Berechnung nicht möglich!");
                break;
            }
            System.out.println("Bitte geben Sie den Nenner ein: ");
            b = scanner.nextInt();

            kehrwert = (double) b /(double)a;
            System.out.println("Dein Ergebnis ist: "+kehrwert);
        }
        while(a != 0);




    }
}
