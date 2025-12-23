package EigeneUebungen;
import java.util.Scanner;
public class Taschenrechner {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Bitte wählen Sie Ihren Operator: +, -, *, :"+"\n"+"oder x zum Beenden.");
            String operator = scanner.next();

            if(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals(":")){
                System.out.println("Bitte geben Sie die erste Zahl ein: ");
                double ersteZahl = scanner.nextDouble();
                System.out.println("Bitte geben Sie eine zweite Zahl ein: ");
                double zweiteZahl = scanner.nextDouble();

                double ergebnis = 0;
                if (operator.equals("+")) {
                    double ergebnisEins = ersteZahl + zweiteZahl;
                    ergebnis = ergebnisEins;
                } else if (operator.equals("-")) {
                    double ergebnisMinus = ersteZahl - zweiteZahl;
                    ergebnis = ergebnisMinus;
                } else if (operator.equals("*")) {
                    double ergebnisMal = ersteZahl * zweiteZahl;
                    ergebnis = ergebnisMal;
                } else if (operator.equals("/")|| operator.equals(":")) {
                    if (zweiteZahl == 0) {
                        System.out.println("Dividieren durch 0 ist ungültig!");
                        continue;
                    }
                    double ergebnisGeteilt = ersteZahl / zweiteZahl;
                    ergebnis = ergebnisGeteilt;
                }
                else {
                    System.out.println("Ungültig");
                    continue;
                }

                System.out.println("Dein Ergebnis lautet: " + ergebnis);
            }
            else{
                System.out.println("Goodbye!");
                break;
            }
            }

    }
}
