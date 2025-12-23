package Lektion3;
import java.util.Scanner;

public class Pizzarechner
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wie groß ist die Pizza die Sie bestellen möchten?");
        int pizza1 = sc.nextInt();
        System.out.println("Wie groß ist die andere Pizza die Sie bestellen möchten?");
        int pizza2 = sc.nextInt();

        System.out.println("Wie viel kostet die "+pizza1+"cm Pizza?");
        float preisPizza1 = sc.nextFloat();
        System.out.println("Wie viel kostet die andere Pizza mit "+pizza2+"cm?");
        float preisPizza2 = sc.nextFloat();

        int radiusPizza1 = pizza1 / 2;
        int radiusPizza2 = pizza2 / 2;

        int flaechePizza1 = (int) ((radiusPizza1 * radiusPizza1) * Math.PI);
        int flaechePizza2 = (int) ((radiusPizza2 * radiusPizza2) * Math.PI);

        float preisProCmPizza1 =(preisPizza1 / flaechePizza1);
        float preisProCmPizza2 =(preisPizza2 / flaechePizza2);

        if (preisProCmPizza1 >= preisProCmPizza2){
        System.out.println("Die Pizza mit "+pizza2+"cm, ist im Preis-Leistungsverhältnis besser.");

        }
        else {
            System.out.println("Die Pizza mit "+pizza1+"cm Durchmesser, ist besser im Preis-Leistungsverhältnis.");
        }








    }
}
