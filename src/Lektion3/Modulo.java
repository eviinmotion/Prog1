package Lektion3;

import java.util.Scanner;

class Modulo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl ein: ");
        int num = sc.nextInt();
        int modulo;
        modulo = num % 7;
        System.out.println("Der Rest beim Dividieren lautet: "+modulo);

    }
}