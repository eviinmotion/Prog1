package Lektion7;
import java.util.Scanner;

public class Lottozahlen {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] lottozahlen = new int[6];

        for(int j = 0; j < lottozahlen.length; j++){
            System.out.println("Bitte geben Sie die Lottozahlen ein!");
            lottozahlen[j] = scanner.nextInt();
            if(lottozahlen[j] < 1 || lottozahlen[j] > 49){
                System.out.println("Bitte geben Sie gültige Zahlen ein!");
                j=j-1;
            }
        }
        for(int i = 0; i < lottozahlen.length; i++){
            for (int k = 0; k < lottozahlen.length-1; k++){
                if(lottozahlen[k] > lottozahlen[k+1]){
                    int temp  = lottozahlen[k];
                    lottozahlen[k] = lottozahlen[k+1];
                    lottozahlen[k+1] = temp;
                }
            }
            }
        System.out.print("Das sind die sortierten Lottozahlen: ");
        for(int j = 0; j < lottozahlen.length; j++){
            System.out.print(lottozahlen[j]+" ");

    }
}}
