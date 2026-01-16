package Altklausuren;

public class Nettorechner {
    public static double berechneNettopreis(double bruttopreis, int mwst){
        double mwstDezimal = (mwst/100.0)+1.0;
        float nettopreis = (float) (bruttopreis /mwstDezimal);
        //kaufmännisch auf 2 nachkommastellen runden
        int temp = (int)(nettopreis*100 + 0.005);
        double ergebnis = temp / 100.0;
        return ergebnis; //2 nachkommastellen ausgeben
    }

    public static void main(String[] args){
        System.out.println(berechneNettopreis(1.07, 7));
    }
}
