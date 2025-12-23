package Lektion5;
import java.util.Scanner;
public class Potenzen {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Basis ein: ");
        double b = scanner.nextDouble();
        System.out.println("Bitte geben Sie eine Potenz ein: ");
        int n = scanner.nextInt();
        double ergebnis =1;

        if(n>0){
            for(int i= 0; i<n; i++){
                ergebnis = ergebnis*b;

            }

        }else if(n<0){
            double nenner = 1;
            int positiveN = -n;

            for(int i= 0; i<positiveN; i++){
                nenner =nenner*b;
                ergebnis = 1.0/nenner;
            }


        }else{
            ergebnis = 1;
        }
        System.out.println(ergebnis);
    }
}
