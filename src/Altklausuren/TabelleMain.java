package Altklausuren;

public class TabelleMain {
    public static void main(String[] args){
        Tabelle[] tables = new Tabelle[10];
        Tabelle best = null;                           //pseudo vergleichswert
        for(int i = 0; i < tables.length; i++) {
            tables[i] = new Tabelle();
            System.out.println(tables[i].toString());

            if(best == null || tables[i].getCounter() > best.getCounter()) {
                best = tables[i];
            }
        }
        System.out.println("Die beste Tabelle ist hat den Wert "+best.getCounter());


    }
}
