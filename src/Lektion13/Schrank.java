package Lektion13;

public class Schrank {
    private Muetze end;

    public Schrank(){
        this.end = null;
    }
    public void einsortieren(Muetze neu){
        if(end == null|| neu.getWert() >= end.getWert()){            //Fall 1: schrank ist leer oder neue Muetze > als alte Muetze
            neu.prev = end;
            end = neu;
            return;
        }
        Muetze current = end;
        while(current.prev != null && neu.getWert() < current.prev.getWert()){    //Liste durchsuchen bis sie endet oder bis neu < als current
            current = current.prev;
        }                                                                       //stelle gefunden
        neu.prev = current.prev;
        current.prev = neu;
    }

    public void entfernen(Muetze wert){
        if(wert == end){
            end = end.prev;
            return;
        }
        Muetze current = end;
        while(current.prev != null){
            if(wert == current.prev){                             //der vorgänger muss gesucht werden nicht der aktuelle, damit wir ihn entfernen können
                current.prev = current.prev.prev;                   //neuer vorgänger == vor vorgänger
                return;
            }
            current = current.prev;                             //zeiger ist jetzt wieder auf den vorgänger
        }
    }
    public int countHats(){
        int counter = 0;
        Muetze current = end;
        while(current != null){ //current statt current.prev weil wir prüfen ob das nächste element existiert
            current = current.prev;
            counter++;
        }
        return counter;
    }
    public void printFarbe(String gesuchteFarbe){
        if(gesuchteFarbe.equals(end.getFarbe())){
            System.out.println(end.getFarbe());
            return;
        }
        Muetze current = end;
        while(current.prev != null){
            if(gesuchteFarbe.equals(current.prev.getFarbe())){
                System.out.println(current.prev.getFarbe());
            }
            current = current.prev;
        }
    }
    public void leereSchrank(){
        end = null;                         //nur ende muss geleert werden, den rest nimmt der garbage collector
    }                                       // ende deshalb weil das der beginn der liste ist
}
