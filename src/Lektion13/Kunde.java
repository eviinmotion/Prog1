package Lektion13;

public class Kunde {
    private int anzahlBestellungen;
    private int maxAnzahlBestellungen;
    Bestellung root;

    public Bestellung artikelZurueckgeben(String name){
        Bestellung currentBestellung = root;
        while(currentBestellung != null){
            Artikel currentArtikel = currentBestellung.root;
            while(currentArtikel != null){
                if(currentArtikel.getArtikelname().equals(name)){
                    return currentBestellung;
                }
                currentArtikel = currentArtikel.next;
            }
            currentBestellung = currentBestellung.next;
        }
        return null;
    }
}
