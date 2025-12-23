package Lektion9;

public class TestAuto {
    public static void main(String[] args) {
    Auto mercedes = new Auto("Mercedes", 2200, "grau", 5);
    System.out.println(mercedes.getHubraum());
    Auto fiat = new Auto("Fiat", -500, "weiss", 3);
    System.out.println(fiat.getHubraum());
    System.out.println(Auto.anzahlAutos);
    }
}
