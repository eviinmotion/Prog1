package Lektion13;

public class Bestellung {
    private int bestellnummer;
    private int anzahlBestellungen;
    private int maxAnzahlBestellungen = 50;
    Artikel root;
    Bestellung next;

    public Bestellung(int bestellnummer) {
        this.bestellnummer = bestellnummer;
        if(anzahlBestellungen >= maxAnzahlBestellungen){
            return;
        }
    }

    public void einfuegen(Artikel neu){
        if(root == null){
            root = neu;
            return;
        }
        Artikel current = root;

        while(current.next != null){        //solange der nachgänger nicht leer ist, gehe zum nächsten über
            current = current.next;
        }
        current.next = neu;                                   //nachgänger ist leer, deshalb jetzt einfügen und methode beenden
    }
    public void artikelEntfernen(Artikel alt){

    }
}
