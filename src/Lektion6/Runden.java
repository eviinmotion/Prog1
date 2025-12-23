package Lektion6;

public class Runden {

    public static int runden(double zahl) {
        int zahlGerundet;
        if (zahl >= (int) zahl + 0.5) {
            zahlGerundet = (int) (zahl + 1);
        } else {
            zahlGerundet = (int) zahl;
        }
        return zahlGerundet;
    }

    public static double rundenNachkomma(double zahl, int nachKommaStellen) {

        if (nachKommaStellen == 0) {
            return runden(zahl);
        }
        double zahlgerundet;
        double multiplikator = 1.0;

        for (int i = 0; i < nachKommaStellen; i++) {
            multiplikator = multiplikator * 10;
        }
        double zahlVerschoben = zahl * multiplikator;
        zahlgerundet = runden(zahlVerschoben);
        double zahlfinal = zahlgerundet/multiplikator;

        return (zahlfinal);
    }
    public static void main(String[] args) {
    System.out.println(rundenNachkomma(7.094534334242, 2));

    }
}


