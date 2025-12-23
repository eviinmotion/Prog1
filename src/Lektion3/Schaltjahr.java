package Lektion3;
import java.util.Scanner;
public class Schaltjahr {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Geben Sie ein Jahr ein: ");
       int jahr = scanner.nextInt();
       int modulo4 = jahr % 4;
       int modulo400 = jahr % 400;
       int modulo100 = jahr % 100;

       if (modulo4 == 0){
           System.out.println("Schaltjahr");
       }
       else if (modulo4 == 0 && modulo100 >1){
           System.out.println("Schaltjahr");
       }
       else if (modulo400 == 0){
           System.out.println("Schaltjahr");
       }
       else {
           System.out.println("Kein Schaltjahr");
       }
    }
}
