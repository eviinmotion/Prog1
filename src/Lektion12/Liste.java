package Lektion12;

public class Liste {
    Personenknoten root;        //kennt anfang liste

    Liste(Personenknoten root){
        this.root = root;                   //konstruktor für liste weil sonst leer
    }
    public void addSortAge(String nachname, int alter){
        Personenknoten neuerKnoten = new Personenknoten(nachname, alter);
        if(root == null){               //wenn listenanfang leer
            root = neuerKnoten;
            return;
        } else{
            Personenknoten current = root;      //anfang ist jetzt current
            while(current.next != null){           //solange der nächste nicht leer ist
                if(alter < current.alter){          //wenn neues alter kleiner ist als aktuelles alter, vor current einfügen
                    current.prev = neuerKnoten;
                }
                current = current.next;
            }
            current.next = neuerKnoten;
        }
    }
    public Personenknoten sucheNachname(String nachname){
        Personenknoten current = root;
        while(current.next != null){
            if(nachname.equals(current.nachname)){
                return current;

            }current = current.next;
        }
        return null;
    }
    public static void printliste(Personenknoten root) {
        Personenknoten current = root;
        while (current != null) {
            System.out.println(current.nachname);
            System.out.println(current.alter);
            current = current.next;
            }
        System.out.println("null");

    }
    public static void printlisteReverse(Personenknoten current){
        if(current == null){
            return;
        }
        printlisteReverse(current.next);
        System.out.println(current.nachname);
        System.out.println(current.alter);
    }
    public static void main(String[] args){
        Personenknoten anton = new Personenknoten("Schmitt", 23);
        Personenknoten berta = new Personenknoten("Mauder", 18);
        Personenknoten celsius = new Personenknoten("Zemelka", 13);
        Personenknoten doris = new Personenknoten("Thomas", 45);
        Personenknoten elfi = new Personenknoten("Hopper", 11);
        Liste liste = new Liste(elfi);

        liste.addSortAge(anton.getNachname(), anton.getAge());
        liste.addSortAge(berta.getNachname(), berta.getAge());
        liste.addSortAge(celsius.getNachname(), celsius.getAge());
        liste.addSortAge(doris.getNachname(), doris.getAge());
        liste.addSortAge(elfi.getNachname(), elfi.getAge());

        liste.printliste(elfi);
        liste.printlisteReverse(elfi);
    }
}
