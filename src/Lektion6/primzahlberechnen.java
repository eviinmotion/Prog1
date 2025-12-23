package Lektion6;

public class primzahlberechnen {
    public class Primzahl {
        public static boolean primzahl(int n) {
            boolean primzahl = false;
            if (n % 2 != 0) {
                primzahl = true;
            }
            return primzahl;
        }
    }

    public static void main(String[] args) {
        System.out.println(Primzahl.primzahl(13));
    }
}


