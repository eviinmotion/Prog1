package Lektion13;

public class Bartheke {
    private Getraenk root;

    public Bartheke(){
        this.root = null;
    }

    public void getraenkEinsortieren(Getraenk neu){
        if(root == null){
            root = neu;
            return;
        }
        if(neu.getPreisInCent() < root.getPreisInCent()) {         //wenn neu kleiner als root
            neu.next = root;                                       //dann ist nach neu die root weiterhin
            root.prev = neu;                                       //vor dem root ist jetzt neu
            root = neu;                                            //ist jetzt der neue eingang in die liste, weils kleiner ist als aktueller root
            return;
        }
        Getraenk current = root;
        while(current.next != null && current.next.getPreisInCent() < neu.getPreisInCent()){ //wenn mein neu größer ist als mein aktuelles
            current = current.next; //dann gehe ich weiter bis der nächste größer ist als mein neu
        }
        neu.next = current.next; //vor mir ist der größere
        neu.prev = current;      //nach mir ist mein aktueller (er ist kleiner)
    }

    public Getraenk aussortieren(String name) {
        if (name.equals(root.getName())) {
            Getraenk aussortiert = root;
            root = root.next; // eins vor rücken
            if (root != null) {
                root.prev = null;
            }
            return aussortiert;
        }
        Getraenk current = root;
        while (current != null) {
            if (name.equals(current.getName())) {
                if (current.next != null) {            //wenn ich den namen gefunden habe, verknüpfe ich den vorgänger mit meinem nachgänger
                    current.next.prev = current.prev;          //auf der seite der zweige bleiben
                }
                if (current.prev != null) {
                    current.prev.next = current.next;
                }
                return current;
            }
            current = current.next;
        }
        return null; //wenn nicht gefunden;
    }
    public String toString(){
        String output = "";
        Getraenk current = root;
        while(current != null){
            output = output + current.getName() + "\n";
            current = current.next;
        }
        return output;
    }
}
