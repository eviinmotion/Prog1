package Lektion13;

public class Fahrstrecke {
    private Zielort root;
    public Fahrstrecke(){}

    public void einfuegen(Zielort neu){
        if(root == null){
            root = neu;
            return;
        }
        Zielort current = root;
        while(current.next != null){  //solange der nachfolger nicht leer ist, soll die schleife gehen
            current = current.next;
        }                               //nachfolger ist leer, deshalb wird neu als nachfolger eingegeben
        current.next = neu;
    }
    public int gesamteStrecke(){
        int gesamtStrecke = 0;
        Zielort current = root;
        while(current != null){
            gesamtStrecke += current.getDistanz();
            current = current.next;       //WICHTIG sonst endlosschleife
        }
        return gesamtStrecke;
    }

    public static void main(String[] args){
        Zielort wuerzburg = new Zielort("Würzburg", 0);
        Zielort kitzingen = new Zielort("Kitzingen", 19);
        Zielort neustadt = new Zielort("Neustadt", 42);
        Zielort nuernberg = new Zielort("Nürnberg", 49);
        Fahrstrecke fahrstrecke = new Fahrstrecke();
        fahrstrecke.einfuegen(wuerzburg);
        fahrstrecke.einfuegen(kitzingen);
        fahrstrecke.einfuegen(neustadt);
        fahrstrecke.einfuegen(nuernberg);
        System.out.println("Die gesamte Fahrtstrecke beträgt "+fahrstrecke.gesamteStrecke());

    }
}
