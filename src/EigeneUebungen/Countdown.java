package EigeneUebungen;
import java.util.Scanner;
public class Countdown {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Bitte geben Sie eine Zahl ein: ");
    int zahl = scanner.nextInt();

    for (int i = zahl-1; i >=0; i--){
        System.out.println(i);

        if(i == 0){
            System.out.println("Start!");
        }
    }

    }
}
